package javaArrayInterviewQuestions;

import java.util.Arrays;

// How do you check the equality of two arrays in Java?

/*
 * we can use Arrays.equals() method to compare one dimensional arrays and 
 * to compare multidimensional arrays, use Arrays.deepEquals() method.
 */

public class EqualityOfTwoArrays {
	
	public static void iterativeMethod() {
		
		int[] arrayOne = {2, 5, 1, 7, 4};
        
        int[] arrayTwo = {2, 5, 1, 7, 4};
         
        boolean equalOrNot = true;
         
        if(arrayOne.length == arrayTwo.length)
        {
            for (int i = 0; i < arrayOne.length; i++)
            {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot = false;
        }
         
        if (equalOrNot)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
        }
	}
	
//	Using Arrays.equals() Method 
	
	public static void Arraysequals() {
		
		String[] s1 = {"java", "j2ee", "struts", "hibernate"};
		 
        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
 
        String[] s3 = {"java", "j2ee", "struts", "hibernate"};
 
        System.out.println(Arrays.equals(s1, s2));        //Output : false
 
        System.out.println(Arrays.equals(s1, s3));      //Output : true
	}
	
	public static void ArraysdeepEquals() {
		
		String[][] s1 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
		 
        String[][] s2 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
 
        System.out.println(Arrays.deepEquals(s1, s2));     //Output : true
         
        //Calling equals() method on same arrays will return false
         
        System.out.println(Arrays.equals(s1, s2));        //Output : false
         
        //That's why use deepEquals() method to compare multidimensional arrays
	}

}
