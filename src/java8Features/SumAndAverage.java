package java8Features;

import java.util.Arrays;

// Given an integer array, find sum and average of all elements?
public class SumAndAverage {
	
	public static void main(String[] args) {
		
		int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
		
		int sum = Arrays.stream(a).sum();
		
		 System.out.println("Sum = "+sum);
         
	        double average = Arrays.stream(a).average().getAsDouble();
	         
	        System.out.println("Average = "+average);
		
	}

}
