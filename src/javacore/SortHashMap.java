package javacore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Write a Java program that sorts HashMap by value.

public class SortHashMap {
	
	private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
		
		Map<String, Integer> sortedByValue = new LinkedHashMap<>();

		// get the entry set
		Set<Entry<String, Integer>> entrySet = scores.entrySet();
		System.out.println(entrySet+"====");

		// create a list since the set is unordered
		List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
		System.out.println(entryList+"-------");

		// sort the list by value
		entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
		System.out.println(entryList+"*******");

		// populate the new hash map
		for (Entry<String, Integer> e : entryList)
			sortedByValue.put(e.getKey(), e.getValue());

		return sortedByValue;
	}

	public static void main(String[] args) {
		
		Map<String, Integer> scores=new HashMap<String,Integer>();
		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		scores.put("Lisa", 78);
		scores.put("Dino", 65);
		
		System.out.println(scores);
		scores = sortByValue(scores);
		System.out.println(scores);
		
	}

}
