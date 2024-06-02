package java8Features;

import java.util.Arrays;
import java.util.List;

public class WordCount {

//	Write a program to count the number of occurrences of a given word in a list of strings using Java 8?
	
	 public static void main(String[] args) {
		 
	       List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
	       String word = "java";
	       long count = strings.stream()
	                           .flatMap(s -> Arrays.stream(s.split(" ")))
	                           .filter(w -> w.equals(word))
	                           .count();
	       System.out.println("Occurrences of \"" + word + "\": " + count);
	    }

}
