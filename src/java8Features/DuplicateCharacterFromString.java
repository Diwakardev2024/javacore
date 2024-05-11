package java8Features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// Print duplicate characters in a string?

public class DuplicateCharacterFromString {
	
	public static void main(String[] args) {
		
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		Set<String> uniquechars=new HashSet<>();
		
		Set<String> duplicateChars=Arrays.stream(inputString.split("")).filter(ch -> !uniquechars.add(ch)).collect(Collectors.toSet());
		
		System.out.println(duplicateChars);
	}

}
