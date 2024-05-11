package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

// How do you find the most repeated element in an array?

public class MostRepeatedString {
	public static void main(String[] args) {
		
		List<String> listOfString=Arrays.asList("Pen","Eraser","Note Book","Pen","Pencil","Pen","Note Book","Pencil");
		
		Map<String,Long> elementCountMap=listOfString.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Entry<String,Long> mostFrequentElement=elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println("Most Frequent Element : "+mostFrequentElement.getKey());
		
		System.out.println("Count : "+mostFrequentElement.getValue());
				
	}

}
