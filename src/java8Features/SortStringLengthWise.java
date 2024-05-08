package java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Given a list of strings, sort them according to increasing order of their length?
public class SortStringLengthWise {
	
	public static void main(String[] args) {
		
		List<String> listOfString=Arrays.asList("Java","Python","C#","HTML","Kotlin","C++","COBOL","C");
	
		listOfString.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		
	}

}
