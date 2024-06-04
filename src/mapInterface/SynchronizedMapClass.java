package mapInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapClass {
	
	// synchronizedMap(Map<k,v> m) : A synchronized map is a map that is thread-safe and is backed by a given map. 
	public static void main(String[] args) {  
        //declare and initialize a map
        Map<Integer, Integer> int_map = new HashMap<>();  
        int_map.put(1, 10);  
        int_map.put(2, 20);  
        int_map.put(3, 30);  
        int_map.put(4, 40);  
        int_map.put(5, 50);  
        //print the map
        System.out.println("Original (backed) Map: " + int_map);        
        //obtain synchronized map
        Map<Integer, Integer> sync_map = Collections.synchronizedMap(int_map);
        //remove an element from the map
        int_map.remove(3, 30);  
        //print the altered map
         System.out.println("\nSynchronized map after remove(3, 30):" + sync_map);  
         }  
}
