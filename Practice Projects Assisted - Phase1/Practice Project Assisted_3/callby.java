
public class callby {
	int n=300;
	int operation(int n) {
		n =n*10/100;
		return(n);
	}
	public static void main(String args[]) {
		callby c = new callby();
		System.out.println("Before operation value of data is: "+c.n);
		c.operation(100);
		System.out.println("After operation value of data is: "+c.n);
		}
}
