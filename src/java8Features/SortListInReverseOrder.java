package java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInReverseOrder {
	public static void main(String[] args) {

		List<Integer> listOfInteger = Arrays.asList(2, 38, 4, 7, 1, 5, 6, 4, 8, 10, 11, 44, 114, 1, 1, 0, 0, 0);
		
		String output = listOfInteger.stream()
						.sorted(Comparator.reverseOrder())
						.map(String::valueOf)
						.collect(Collectors.joining(","));
		System.out.println(output);
	}

}
