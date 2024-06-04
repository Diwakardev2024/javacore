package mapInterface;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapClass {
	  public static void main(String[] args) { 
	        //create and initialize concurrentHashMap
	        ConcurrentHashMap m = new ConcurrentHashMap(); 
	        m.put(100, "Red"); 
	        m.put(101, "Green"); 
	        m.put(102, "Blue"); 
	        System.out.println("\nInitial Concurrent Map : " + m);
	        //add a key using putIfAbsent method; key=103 is absent so its added
	        m.putIfAbsent(103, "Purple"); 
	        System.out.println("\nAfter adding absent key 103 : " + m);
	        m.remove(101, "Green");                 // remove key = 101 
	        System.out.println("\nConcurrent Map after removing 101:" + m);
	         
	        m.putIfAbsent(101, "Brown");     // again add key = 101 since its absent
	        System.out.println("\nAdd absent key 101:" + m);
	 
	        m.replace(101, "Brown", "Green");                 // replace value for key = 101 with 'Green' 
	        System.out.println("\nReplace value at key 101:" + m); 
	    } 

}
