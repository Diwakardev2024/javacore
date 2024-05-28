package java8Features;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfEachCharacter {
	
//	 Write a program to print the count of each character in a String?
	
	public static void findCountOfChars(String s) {
		
		Map<String,Long> map=Arrays.stream(s.split("")).map(String::toLowerCase)
				.collect(Collectors
						.groupingBy(str ->str,LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		
		String s = "string data to count each character";
		
		findCountOfChars(s);
	}

}
