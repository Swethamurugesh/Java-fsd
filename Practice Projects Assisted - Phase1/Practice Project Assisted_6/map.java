import java.util.*;
public class map {
	public static void main(String[] args) {
		
		//Hash Map
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"John");    
	      hm.put(2,"Bob");    
	      hm.put(3,"Abby");   
	       
	      System.out.println("\nThe elements of Hashmap are: ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      ht.put(4,"Matt");  
	      ht.put(5,"Alice");  
	      ht.put(6,"Jack");  
	      ht.put(7,"Joy");  
	      System.out.println("\nThe elements of HashTable are: ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //Tree Map
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Annie");    
	      map.put(9,"Happy");    
	      map.put(10,"Catie");       
	      System.out.println("\nThe elements of TreeMap are: ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
