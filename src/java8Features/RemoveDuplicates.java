package java8Features;

import java.util.Arrays;

public class RemoveDuplicates {
	
//	How to remove all duplicates from an array of integers in Java using Java 8?
	
	 public static void main(String[] args) {
		 
	       Integer[] array = {5, 10, 3, 7, 2, 10, 5};
	       Integer[] distinct = Arrays.stream(array)
	                                  .distinct()
	                                  .toArray(Integer[]::new);
	       System.out.println("Distinct elements: " + Arrays.toString(distinct));
	    }

}
