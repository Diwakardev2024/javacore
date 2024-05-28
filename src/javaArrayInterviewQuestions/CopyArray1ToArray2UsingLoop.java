package javaArrayInterviewQuestions;

import java.util.Arrays;

// Copying An Array Using for Loop 

public class CopyArray1ToArray2UsingLoop {

	public static void method1() {
		
		int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
		
		 int[] b = new int[a.length];  //Declaring and instantiating another array of ints with same length
		 
		 for(int i=0;i<a.length;i++) {
			 
			 b[i]=a[i];
		 }
		 
		   a[2] = 56; 
		   a[4]=78;
		 
		 System.out.println(b[2]);
		 System.out.println(a[2]);
	}
	

	// Copying An Array Using copyOf() Method of java.util.Array Class 
	
	public static void method2() {
		
		int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
		
		int[] b = Arrays.copyOf(a, a.length);  
		 
        //Printing elements of array 'b'
 
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
		
        a[2] = 56; 
        a[4]=78;
	}
	
//	Copying An Array Using clone() Method :
	
	public static void method3() {
		
		int[] a = {12, 21, 0, 5, 7}; 
		  int[] b = a.clone();  
		  
		  for (int i = 0; i < b.length; i++)
	        {
	            System.out.println(b[i]);
	        }
		
	}
	
//	Copying An Array Using arraycopy() Method Of System Class :
	
	public static void method4() {
		
		int[] a = {12, 21, 0, 5, 7};  
		int[] b = new int[a.length];
		
		System.arraycopy(a, 0, b, 0, a.length);
		
		for (int i = 0; i < b.length; i++)
        {
            System.out.print(b[i]+" ");
        }
 
		
	}
	
	public static void main(String[] args) {
		
//		method1();
//		method2();
//		method3();
		method4();
	}
}
