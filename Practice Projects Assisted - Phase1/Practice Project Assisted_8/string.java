public class string {
	public static void main(String[] args) {
		
		//Methods of strings
		System.out.println("Methods of Strings:");
		String sl=new String("Hello World");
		System.out.println(sl.length());

		//Substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));

		//String Comparison
		String s2="Hello";
		String s3="Heldo";
		System.out.println(s2.compareTo(s3));

		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());

		//toLowerCase
		String s5="Hello";
		System.out.println(s5.toLowerCase());
		
		//replace
		String s6="Heldo";
		String replace=s6.replace('d', 'l');
		System.out.println(replace);

		//equals
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
 
	
		System.out.println("\nCreating StringBuffer: ");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("This is StringBuffer");
		System.out.println(s);

		//insert method
		s.insert(0, 'w');
		System.out.println(s);

		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\nCreating StringBuilder:");
		StringBuilder sb1=new StringBuilder("String");
		sb1.append("Builder");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
					
		System.out.println("\nConversion of Strings to StringBuffer and StringBuilder");
		String str = "Hello"; 
        
        //String to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        //String to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}

}
