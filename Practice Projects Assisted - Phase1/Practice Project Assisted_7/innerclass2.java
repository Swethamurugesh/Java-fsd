
public class innerclass2 {
	private String msg=" The Inner Class";

	 void display() {  
		 class Inner {  
			 void msg() {
				 System.out.println(msg);
			 }  
	  }  
	  Inner l=new Inner();  
	  l.msg();  
	 }	 
	public static void main(String[] args) {
		innerclass2  obj = new innerclass2 ();  
		obj.display();  
		}
}
