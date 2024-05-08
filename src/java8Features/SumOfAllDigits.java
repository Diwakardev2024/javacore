package java8Features;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Find sum of all digits of a number in Java 8?

public class SumOfAllDigits {
	public static void main(String[] args) {
		
		int i= 15623;
		
		Integer sumOfDigits=Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		
		System.out.println(sumOfDigits);
	}

}
