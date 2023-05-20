CAMERA RENTAL APP
SOURCE CODE: (package camerarent)

Class main 
----------------------
package camerarent;

class Camera {
    private int id;
    private String brand;
    private String model;
    private double rentalPrice;
    private boolean rented;

    public Camera(int id, String brand, String model, double rentalPrice, boolean rented) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this. rentalPrice = rentalPrice;
        this.rented = rented;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}




Usermain class
--------------------


package camerarent;
import java.util.ArrayList;
import java.util.List;

class user {
    private String username;
    private String password;
    private List<Camera> cameraList;
    private double walletBalance;

    public user(String username, String password) {
        this.username = username;
        this.password = password;
        this.cameraList = new ArrayList<>();
        this.walletBalance = 7000.0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Camera> getCameraList() {
        return cameraList;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void addCamera(Camera camera) {
        cameraList.add(camera);
    }

    public void removeCamera(int camId) {
        Camera camera = getCameraById(camId);
        if (camera != null) {
            cameraList.remove(camera);
        }
    }

    public Camera getCameraById(int camId) {
        for (Camera camera : cameraList) {
            if (camera.getId() == camId) {
                return camera;
            }
        }
        return null;
    }

    public void depositToWallet(double amount) {
        walletBalance += amount;
    }
}



class cameraRentalApp
---------------------

package camrental;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cameraRentalApp {
    private static user currentUser;
    private static List<Camera> cameraList;

    public static void main(String[] args) {
        initialize();
        showMainScreen();
        login();
        showMainMenu();
    }

    private static void initialize() {
        currentUser = null;
        cameraList = new ArrayList<>();
        cameraList.add(new Camera(1, "parasonic","Digital",600.0,false));
        cameraList.add(new Camera(2, "Sony", "DSLR", 200.0, false));
        cameraList.add(new Camera(3, "Samsung", "SM123", 200.0, false));
        cameraList.add(new Camera(4, "LG", "L123", 500.0, false));
        cameraList.add(new Camera(5, "fujista", "J5", 500.0, false));
        cameraList.add(new Camera(6, "sony", "DSLR12", 500.0, false));
        cameraList.add(new Camera(7, "Canon", "XPL", 700.0, false));
        cameraList.add(new Camera(8, "nikon", "2030", 950.0, false));
        cameraList.add(new Camera(9, "samsung", "DSLR12", 900.0, false));
        cameraList.add(new Camera(10, "nikon", "5050", 800.0, false));
        cameraList.add(new Camera(11, "Chroma", "CT", 500.0, false));

    }

    private static void showMainScreen() {
    	System.out.println("\n+----------------------------------+");
        System.out.println("|   WELCOME TO CAMERA RENTAL APP   |");
    	System.out.println("+----------------------------------+\n");
        System.out.println("PLEASE LOGIN TO CONTINUE");
    }

    private static void login() {
        Scanner sc = new Scanner(System.in);
        String username;
        String password;

        do {
            System.out.print("USERNAME: ");
            username = sc.nextLine();
            System.out.print("PASSWORD: ");
            password = sc.nextLine();
        } while (!isValidLogin(username, password));

        System.out.println("\nLogin Successful.");
    }

    private static boolean isValidLogin(String username, String password) {
        if (username.equals("admin") && password.equals("admin123")) {
        	currentUser = new user(username, password);
        	return true;
        } 
        else {
        	System.out.println("\nInvalid username or password. Please try again.\n");
        	return false;
        }
    }
    private static void showMainMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
        	System.out.println("\n1. MY CAMERA");
            System.out.println("2. RENT A CAMERA");
            System.out.println("3. VIEW ALL CAMERAS");
            System.out.println("4. MY WALLET");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    viewMyCamera();
                    break;
                case 2:
                    rentingCamera();
                    break;
                case 3:
                    viewAllCameras();
                    break;
                case 4:
                    showWallet();
                    break;
                case 5:
                    System.out.println("Thank you for using the Camera Rental App. Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }

    private static void viewMyCamera() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. ADD");
            System.out.println("2. REMOVE");
            System.out.println("3. VIEW MY CAMERAS");
            System.out.println("4. GO TO PREVIOUS MENU");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addMyCamera();
                    break;
                case 2:
                	removeMyCamera();
                    break;
                case 3:
                	showMyCameras();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }

    private static void addMyCamera() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nENTER THE CAMERA BRAND: ");
        String brand = sc.nextLine();
        System.out.print("ENTER THE MODEL: ");
        String model = sc.nextLine();
        System.out.print("ENTER THE PER DAY PRICE(INR): ");
        double rentalPrice = sc.nextDouble();

        int nextId = cameraList.size() + 1;
        Camera camera = new Camera(nextId, brand, model, rentalPrice, false);
        cameraList.add(camera);

        System.out.println("YOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST.");
    }
    private static void removeMyCamera() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================================================================");
        System.out.println("CAMERA ID\tBRAND\t\tMODEL\t\tPRICE(PER DAY)\tSTATUS");
        System.out.println("===============================================================================");
        for (Camera camera : cameraList) {
            System.out.println(camera.getId() + "\t\t" + 
                               camera.getBrand() + "\t\t" +
                               camera.getModel() + "\t\t" + 
                               camera.getRentalPrice() + "\t\t" +
                              (camera.isRented() ? "Rented" : "Available"));
        }
        System.out.println("===============================================================================");
        System.out.print("\nENTER THE CAMERA ID TO REMOVE: ");
        int camID=sc.nextInt();
		sc.nextLine();
		boolean removed = false;
		for(Camera camera: cameraList) {
			if(camera.getId()==camID) {
				cameraList.remove(camera);
				removed = true;
				break;
			}
		}
		if(removed) {
			System.out.println("CAMERA SUCCESSFULLY REMOVED FROM THE LIST.");
		}
		else {
			System.out.println("CAMERA NOT FOUND.");
		}
	}
    private static void showMyCameras() {
        List<Camera> cameraList = currentUser.getCameraList();

        System.out.println("\nMY CAMERAS");
        System.out.println("===============================================================================");
        System.out.println("CAMERA ID\tBRAND\t\tMODEL\t\tPRICE(PER DAY)\tSTATUS");
        System.out.println("===============================================================================");

        boolean foundRentedCamera = false;
        for (Camera camera : cameraList) {
            if (camera.isRented()) {
                System.out.println(camera.getId()+ "\t\t" + 
                                   camera.getBrand()+ "\t\t" + 
                		           camera.getModel()+ "\t\t" +
                                  (camera.getRentalPrice()+ "\t\t" + "Rented"));
                foundRentedCamera = true;
            }
        }

        if (!foundRentedCamera) {
            System.out.println("No rented cameras found.");
        }

        System.out.println("===============================================================================");
    }

    private static void rentingCamera() {
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("\nFollowing is the list of available cameras");
        System.out.println("===============================================================================");
        System.out.println("CAMERA ID\tBRAND\t\tMODEL\t\tPRICE(PER DAY)\tSTATUS");
        System.out.println("===============================================================================");
        for (Camera camera : cameraList) {
            if (!camera.isRented()) {
                System.out.println(camera.getId() + "\t\t" + 
                                   camera.getBrand() + "\t\t" +
                                   camera.getModel() + "\t\t" + 
                                   camera.getRentalPrice() + "\t\t" +
                                  (camera.isRented() ? "Rented" : "Available"));
            }
        }
        System.out.println("===============================================================================");

        System.out.print("\nENTER THE CAMERA ID YOU WANT TO RENT: ");
        int camId = sc.nextInt();

        Camera selectedCamera = null;
        for (Camera camera : cameraList) {
            if (camera.getId() == camId) {
                selectedCamera = camera;
                break;
            }
        }

        if (selectedCamera != null && !selectedCamera.isRented()) {
            if (currentUser.getWalletBalance() >= selectedCamera.getRentalPrice()) {
                selectedCamera.setRented(true);
                currentUser.getCameraList().add(selectedCamera);
                currentUser.depositToWallet(-selectedCamera.getRentalPrice());
                System.out.println("Your transaction for camera - " + selectedCamera.getBrand() +
                        " " + selectedCamera.getModel() + " with rent INR." +
                        selectedCamera.getRentalPrice() + " has successfully completed.");
            } else {
                System.out.println("ERROR: TRANSACTION FAILED DUE TO INSUFFICIENT WALLET BALANCE. " +
                        "PLEASE DEPOSIT THE AMOUNT TO YOUR WALLET.");
            }
        } else {
            System.out.println("ERROR: INVALID CAMERA ID OR CAMERA IS ALREADY RENTED.");
        }
    }

    private static void viewAllCameras() {
    	System.out.println("===============================================================================");
        System.out.println("CAMERA ID\tBRAND\t\tMODEL\t\tPRICE(PER DAY)\tSTATUS");
        System.out.println("===============================================================================");
        for (Camera camera : cameraList) {
            System.out.println(camera.getId() + "\t\t" + 
                               camera.getBrand() + "\t\t" +
                               camera.getModel() + "\t\t" + 
                               camera.getRentalPrice() + "\t\t" +
                              (camera.isRented() ? "Rented" : "Available"));
        }
        System.out.println("===============================================================================");
    }

    private static void showWallet() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nYOUR CURRENT WALLET BALANCE IS INR." + currentUser.getWalletBalance());
        System.out.print("DO YOU WANT TO DEPOSIT MORE AMOUNT TO YOUR WALLET? (1.YES 2.NO): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("ENTER THE AMOUNT (INR): ");
                double amount = sc.nextDouble();
                currentUser.depositToWallet(amount);
                System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY. CURRENT WALLET BALANCE - INR." +
                        currentUser.getWalletBalance());
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid choice. Going back to previous menu.");
                break;
        }
    }

    private static void exit() {
        System.out.println("Thank you for using the Camera Rental App. Exiting...");
        System.exit(0);
    }
}


