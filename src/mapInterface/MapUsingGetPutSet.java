package mapInterface;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public interface MapUsingGetPutSet {
	
	
	public static <K, V> void display_map(Map<K, V> map) {
	       //obtain entry iterator and display key value pairs of map
	        for (Map.Entry<K, V> entry : map.entrySet()) {
	            System.out.println("\t" + entry.getKey() + "\t\t" + entry.getValue());
	        }
	    }
	public static LinkedHashMap<String, String> sortMap(LinkedHashMap<String, String> linked_map){
		// create a linkedlist from LinkedHashMap
		List<Map.Entry<String, String>> capital_list=new LinkedList<>(linked_map.entrySet());
		
		// sort the LinkedList
		Collections.sort(capital_list,(o1,o2)->o1.getValue().compareTo(o2.getValue()));
		
		// create LinkedHasMap from linkedlist and return it
		LinkedHashMap<String,String> finalmap=new LinkedHashMap<>();
		for(Map.Entry<String, String> entry : capital_list) {
			finalmap.put(entry.getKey(),entry.getValue());
		}
		return finalmap;
	}
	public static void main(String[] args) {
		Map<String,String> country_map=new HashMap<>();
		country_map.put("IND", "India");
		country_map.put("SL", "SriLanka");
		country_map.put("HN", "China");
		country_map.put("KOR", "Korea");
		country_map.put(null, "Z");
		country_map.put("XX", null);
		Set<Entry<String, String>> entrySet = country_map.entrySet();  //entrySet
	    System.out.println("\nentry set for the country_map: " + entrySet);
	    
	    Map<String, String> data_map = new HashMap<>();
	    data_map.putAll(country_map);       //putAll
	    System.out.println("\ndata_map mapped to country_map : " + data_map);
	    
	    String nullKeyValue = data_map.remove(null);  //remove
	    System.out.println("\nnull key value for data_map : " + nullKeyValue);
	    System.out.println("\ndata_map after removing null key = " + data_map);
	    
	    Set<String> keySet = country_map.keySet();      //keySet
	     System.out.println("\ndata map keys : " + keySet);
	     
	     Collection<String> values = country_map.values();   //values
	        System.out.println("\n data map values : " + values);
	     
	        
	      //convert map to treemap and display it in which keys are auto sorted
//	        Map<String, String> treecountry = new TreeMap<String, String>(country_map);
//	        display_map(treecountry);
	 
//	        display_map(country_map);
	        LinkedHashMap<String, String> capitals_map = new LinkedHashMap<>(); 
	        Map<String, String> sorted_Map = sortMap(capitals_map);
	    
	}
	
	
}
