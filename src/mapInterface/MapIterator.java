package mapInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapIterator {

	// the following methods are used to traverse the map entries.
	public static void iteratorMapApproach1() {
		Map<String, String> map_cities = Stream
				.of(new String[][] { { "MH", "Mumbai" }, { "CH", "Chennai" }, { "DL", "New Delhi" } })
				.collect(Collectors.toMap(p -> p[0], p -> p[1]));

		Set<Map.Entry<String, String>> entries = map_cities.entrySet();

		Iterator<Map.Entry<String, String>> iterator = entries.iterator();
		System.out.println("This map entries are: " + " KEY VALUE");
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println("\t"+"\t" + entry.getKey() + "\t" + entry.getValue());
		}
	}
		
		public static void iteratorMapApproach2() {
			// Using an Entry for-each loop
			Map<String, String> map_cities = Stream.of(new String[][] { { "MH", "Mumbai" }, { "CH", "Chennai" }, { "DL", "New Delhi" } })
					.collect(Collectors.toMap(p -> p[0], p -> p[1]));
			System.out.println("This map entries are: " + " KEY VALUE");
			  for(Map.Entry<String, String> entry : map_cities.entrySet()){
				  
		            System.out.println("\t" + entry.getKey() + "\t" +entry.getValue());
		        }
			
		}

		
	
	public static void main(String[] args) {
//		iteratorMapApproach1();
		iteratorMapApproach2();
	}
	

}
