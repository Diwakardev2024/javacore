package javaArrayInterviewQuestions;


//  What is ArrayStoreException in Java? When you will get this exception?

public class ArrayExceptionCondition {
	
	/*
	 * Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer
	at javaArrayInterviewQuestions.ArrayExceptionCondition.main(ArrayExceptionCondition.java:19)

	 * 
	 */
	
	public static void main(String[] args) {
		
		Object[] stringArray=new String[5];
		stringArray[1]="Java";
		stringArray[2]=100;
		System.out.println(stringArray);
		
		
		//Can you pass the negative number as an array size?
		
		int[] array = new int[-5];     //No compile time error but you will get java.lang.NegativeArraySizeException at run time
		
		//Creating anonymous arrays
		 
        System.out.println(new int[]{1, 2, 3, 4, 5}.length);    //Output : 5
 
        System.out.println(new int[]{21, 14, 65, 24, 21}[1]);   //Output : 14
		
	}

}
