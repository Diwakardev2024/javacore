package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

// Given a list of strings, find out those strings which start with a number?

public class FindStringStartWithNumber {

	public static void main(String[] args) {
		
		List<String> listOfStrings=Arrays.asList("one","2wo","3three","Four4","5ive","Six");
		
		listOfStrings.stream().filter(str->Character.isDigit(str.charAt(0) )).forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		 List<String> strings = Arrays.asList("123abc321", "abc123", "1abc2", "abc", "123abc", "456xyz789");
		 Pattern pattern = Pattern.compile("^[0-9].*[0-9]$");
		 List<String> result = strings.stream()
                 .filter(s -> pattern.matcher(s).matches())
                 .collect(Collectors.toList());
		 System.out.println(result); 
	}
	
}
