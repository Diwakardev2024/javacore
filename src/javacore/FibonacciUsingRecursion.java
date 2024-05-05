package javacore;

// Write a Java program to print a Fibonacci sequence using recursion.

public class FibonacciUsingRecursion {

	public int fibonacci(int number ) {
		
		if(number<=1)
			return number;
		
	return fibonacci(number-1)+fibonacci(number-2);
		
		
	}
	
	public static void main(String[] args) {
		
		FibonacciUsingRecursion re=new FibonacciUsingRecursion();
		for(int i=0;i<10;i++) {
		System.out.print(re.fibonacci(i)+" ");
		}
	} 
	
	
}
