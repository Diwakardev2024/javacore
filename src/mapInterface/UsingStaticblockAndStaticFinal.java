package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class UsingStaticblockAndStaticFinal {
	 private static final HashMap<Integer,String> myMap = new HashMap<Integer, String>(){
             {
                 put(1, "India");
                 put(2, "Portugal");
                 put(3, "Germany");
             }
 };
 private static Map<Integer, String> map; 
 // declare a static block and initialize static map
 static { 
     map = new HashMap<>(); 
     map.put(1, "Red"); 
     map.put(2, "Green"); 
     map.put(3, "Blue"); 
 } 
 
 public static void main(String[] args) {
	 
	 System.out.println("Static map using static map variable:");
     System.out.println(myMap);
     
	 System.out.println("Static Map using static block:");
     System.out.println(map); 
}

}
