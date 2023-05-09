
public class innerclass1 {
	private String msg="Hello Hi"; 
	 
	 class Inner {  
	  void class1() {
		  System.out.println(msg+", This is Inner Class");
		  }  
	 }  
	public static void main(String[] args) {

		innerclass1 obj=new innerclass1();
		innerclass1.Inner in=obj.new Inner();  
		in.class1();  
	}
}
