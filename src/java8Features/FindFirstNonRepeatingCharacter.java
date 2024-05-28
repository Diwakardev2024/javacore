package java8Features;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {
	
//	Given a String, find the first non-repeated character in it using Stream functions?

	public static void main(String[] args) {

		String input = "Java articles are Awesome";

		Character result = input.chars() // stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(result);
	}

}
