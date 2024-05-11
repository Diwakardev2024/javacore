package java8Features;

import java.util.Arrays;

// Write a Java 8 program to sort an array and then convert the sorted array into Stream?

public class ToSortArrayConvertSortedStreamArray {
	
	public static void main(String[] args) {
		
		int arr[]= {99,55,203,99,4,91};
		
		Arrays.parallelSort(arr);
		
		
		Arrays.stream(arr).forEach(n->System.out.print(n+" "));
		
		
	}

}
