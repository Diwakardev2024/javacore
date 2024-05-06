package javacore;

import java.util.Arrays;

//  How do you sort an array in Java?
public class SortArrays {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 8, 1, 7, 9, 14 };
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
	}
}
