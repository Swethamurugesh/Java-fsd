
abstract class anonymousInner {
	   public abstract void display();
	}

	public class innerclass3 {
	public static void main(String[] args) {
		anonymousInner obj = new anonymousInner() {
	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      obj.display();
	   }
}
