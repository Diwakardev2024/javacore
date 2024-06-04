package mapInterface;
import java.util.*; 
import java.util.stream.*; 
import java.util.stream.Collectors;  
public class MapIntialiozation {

	    public static void main(String args[])  { 
	        //using Collections
	        //create an empty map
	        Map<String, String> emptymap = Collections.EMPTY_MAP;
	        //create unmodifiable map using Collections
	        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(emptymap);
	        System.out.println("unmodifiableMap map values:" + unmodifiableMap);
	        //singleton map
	        Map<Integer, String> singleton_map = Collections.singletonMap(10, " TEN");
	        System.out.println("\n\nsingleton_map Map values:" + singleton_map);
	        //using Java 8
	        //1. toMap method of collectors class
	        Map<String, String> map_cities = Stream.of(new String[][]{
	            {"MH", "Mumbai"}, {"CH", "Chennai"}, {"DL", "New Delhi"}
	                        }).collect(Collectors.toMap(p -> p[0], p -> p[1]));
	        System.out.println("\n\nmap_cities values: " + map_cities);                
	        //2. collectingAndThen method
	        Map<String, String> capitals_Map = Stream.of(new String[][]{
	            {"MAH", "Mumbai"}, {"GOA", "Panaji"},     {"KAR", "Bangaluru"}
	                        }).collect(Collectors.collectingAndThen
	                        (Collectors.toMap(p -> p[0], p -> p[1]),
	                    Collections::<String, String>unmodifiableMap));
	 
	   
	        System.out.println("\n\ncapitals_Map values: " + capitals_Map);
	        
	        //double brace initialization
	        Map<String, String> country_map = new HashMap<String, String>();
	        country_map.put("USA", "Washington");
	        country_map.put("UK", "London");
	        country_map.put("IND", "Delhi");
	        country_map.put("GER", "Berlin");
	        System.out.println("\n\nMap values:" + country_map);
	    } 
	}



