import java.util.*;
public class collection {
	public static void main(String[] args) {
		
		//ArrayList
		  System.out.println("ArrayList:");
		  ArrayList<String> city=new ArrayList<String>();   
	      city.add("Bangalore");
	      city.add("Delhi");    	   
	      System.out.println(city);  

		//Vector
	      System.out.println("\nVector:");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(20); 
	      vec.addElement(10); 
	      System.out.println(vec);
		
		//LinkedList
	      System.out.println("\nLinkedList:");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Jhon");  
	      names.add("Bob");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  }
	       
	    //Hashset
	       System.out.println("\nHashSet:");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	    //LinkedHashSet
	       System.out.println("\nLinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  
