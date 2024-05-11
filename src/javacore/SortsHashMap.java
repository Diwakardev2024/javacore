package javacore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Write a Java program that sorts HashMap by value.

public class SortsHashMap {
	
	public static Map<String,Integer> sortByValue(Map<String,Integer> ages){
		
		Map<String,Integer> sortedByValue=new LinkedHashMap<>();
		
		Set<Entry<String,Integer>>  entrySet=ages.entrySet();
		
		List<Entry<String,Integer>> entryList=new ArrayList<>(entrySet);
		System.out.println("EntryList "+entryList);
		
		entryList.sort((x,y)->x.getKey().toUpperCase().compareTo(y.getKey().toUpperCase()));
		
		System.out.println(entryList);
		
		for(Entry<String,Integer> e : entryList)
			sortedByValue.put(e.getKey().toUpperCase(),e.getValue());
		
		
		return sortedByValue;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Map<String,Integer> scores=new HashMap<>();
		scores.put("David", 95);
		scores.put("Sanju", 45);
		scores.put("Ranjahana", 35);
		scores.put("Raju", 25);
		scores.put("SunilDutt", 85);
		
		System.out.println("Original Scores "+scores);
		
		scores=sortByValue(scores);
		
		System.out.println("Result of Sorted list:- "+scores);
		
	}

}
