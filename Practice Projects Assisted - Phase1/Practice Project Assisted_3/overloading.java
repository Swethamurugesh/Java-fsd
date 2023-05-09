public class overloading {
    public void area1(int r) 
    {
         System.out.println("Area of Circle: "+(3.14*r*r));
    }
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle: "+(0.5*b*h));
    }
    public static void main(String args[]) {
    	overloading obj = new overloading();
        obj.area1(4);  
        obj.area(4,8);
   }
}
