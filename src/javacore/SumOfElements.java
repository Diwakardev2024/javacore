package javacore;

// How do you get the sum of all elements in an integer array in Java?

public class SumOfElements {
	public static void main(String[] args) {
		
	
	Integer[] array= {1,5,4,6,8,9};
	
	int sum=0;
	for(int n:array) {
		
		sum+=n;
		
	}
	
	System.out.println("sum of array elements = "+sum);
 
	}
}
