package typecaste;

public class TypeCasting {
	public static void main(String[] args) {
		//implicit
		System.out.println("Implicit Type Casting:");
		char a='S';
		System.out.println("Value of a: "+a);
		int b=a;
		System.out.println("Value of b: "+b);
		float c=a;
		System.out.println("Value of c: "+c);
		long d=a;
		System.out.println("Value of d: "+d);
		double e=a;
		System.out.println("Value of e: "+e);
		System.out.println("\nExplicit Type Casting:");
		//explicit 
		double x=20.3;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);	
	}
}
