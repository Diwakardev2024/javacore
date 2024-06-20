package java8Features;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInString {
	
	public static void main(String[] args ) {
		 
		String s="Aswderfrddlhjaadfewrsk";
		
		Map<Character, Long> Map=s.chars()
									.mapToObj(c->(char)c)
									.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(Map);
		
	}

}
