//parameterized constructor
class StdInfo{
	int id;
	String name;
	StdInfo(int i,String n)
	{
	id=i;
	name=n;
	}
	void display() {
	System.out.println(id+" "+name);
	}
}

public class Student {
public static void main(String[] args) {
	StdInfo std1=new StdInfo(1,"Ram");
	StdInfo std2=new StdInfo(2,"Bob");
	std1.display();
	std2.display();
	}
}
