package javacore;

//  How do you swap two numbers without using a third variable in Java?

public class SwapTwoNumberWithoutUsingThirdVariable {
	
	
	public void swap(int a ,int b) {
		
		System.out.printf(" Before Swaping a : %d  b : %d",a,b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println();
		System.out.printf("After Swaping a : %d  b : %d",a,b);
	}
	
	public static void main(String[] args) {
		
		SwapTwoNumberWithoutUsingThirdVariable swapNumber=new SwapTwoNumberWithoutUsingThirdVariable();
		swapNumber.swap(15, 20);
	}

}
