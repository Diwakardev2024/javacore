package javacore;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Write Java program that checks if two arrays contain the same elements.

public class CheckContentOfTwoArray {
	
	
	 static boolean sameElements(Object[] array1,Object[] array2) {
		 
		 Set<Object> uniqueElements1=new HashSet<>();
		 Set<Object> uniqueElements2=new HashSet<>();
		 
		// if size is different, means there will be a mismatch
			if (uniqueElements1.size() != uniqueElements2.size())
				return false;
			
			for (Object obj : uniqueElements1) {
				// element not present in both?
				if (!uniqueElements2.contains(obj)) 
					return false;
			}
			
			return true;
	 }

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 8, 5, 6, 7 };
		
		Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		Integer[] a3 = {1,2,3,4};

		boolean result = Arrays.equals(arr1, arr2);
		System.out.println(result);
		
		System.out.println("a1 and a2 is : "+sameElements(a1, a2));
		System.out.println("a1 and a3 is : "+sameElements(a1, a3));
		
		
	}

}
