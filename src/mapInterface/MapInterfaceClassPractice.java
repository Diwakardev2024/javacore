package mapInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapInterfaceClassPractice {
	
	//Static map 
	private static final HashMap<Integer, String> myMap =  new HashMap<Integer, String>(){
            {
                put(1, "India");
                put(2, "Portugal");
                put(3, "Germany");
            }
	};

	
	public static void main(String[] args) {
		// INitilaize a MAP 
		// 1) Collections.EMPTYMAP()
		
//		Map<String,String> myMap=Collections.EMPTY_MAP;
		Map<String, String> myMap1=Collections.emptyMap();
		
//		System.out.println(myMap1);
		Map<String, String> map_unmodifiable=Collections.unmodifiableMap(myMap1);
		Map<String, String> singleton_map = Collections.singletonMap("CHN", "Beijing");
		
		// create maps using Collectors
		
		String[][] b= {{"Name","Diwakar Kumar"},{"Mobile Number","8375991846"},{"Address","Mahavir Asthan Kuraich"}};
		
		Map<String, String> map=Stream.of(new String[][] {{"USA","Washington"},{"United Kingdom","London"}}).collect(Collectors.toMap(p ->p[0],p ->p[1]));
		Map<String, String> map1=Stream.of(b).collect(Collectors.toMap(p ->p[0],p ->p[1]));
		
		System.out.println(map1);
		System.out.println(map);
		
		
		System.out.println("Static map using static map variable:");
        System.out.println(myMap);
		
		
		
	}
	
	
	}

	
	

