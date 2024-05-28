package java8Features;

import java.util.Arrays;

public class MaximumElementFromArray {
	
//	 Write a Program to find the Maximum element in an array?
	
	public static int findMaxElement(int[] arr) {
		
		  return Arrays.stream(arr).max().getAsInt();
		}
	
	public static void main(String[] args) {
		
		int[] arr= {12,19,20,88,00,9};
		
		int max=findMaxElement(arr);
		System.out.println(max);
	}

}
