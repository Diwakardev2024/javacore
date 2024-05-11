package java8Features;

import java.util.Arrays;
import java.util.List;

// Given a list of strings, find out those strings which start with a number?

public class FindStringStartWithNumber {

	public static void main(String[] args) {
		
		List<String> listOfStrings=Arrays.asList("one","2wo","3three","Four","5ive","Six");
		
		listOfStrings.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(x->System.out.print(x+" "));
	}
	
}
