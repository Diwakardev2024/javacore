package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Write a Java 8 program to remove the duplicate elements from the list?

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		Integer[] arr1 = new Integer[] { 1, 9, 8, 7, 7, 8, 9 };
		 List<Integer> listdup = Arrays.asList(arr1);
		 Set<Integer> setNoDups = listdup.stream().collect(Collectors.toSet());
		 setNoDups.forEach(i -> System.out.print(" " + i));


		
	}

}
