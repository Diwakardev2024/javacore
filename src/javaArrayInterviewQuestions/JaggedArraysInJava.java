package javaArrayInterviewQuestions;

public class JaggedArraysInJava {
	
	public static void jaggedArrays() {
		
		int[] OneDimensionalArray1 = {1, 2, 3};
		int[] oneDimensionalArray2 = {4, 5, 6, 7};
		int[] oneDimensionalArray3 = {8, 9, 10, 11, 12};
		int[][] twoDimensionalArray = {OneDimensionalArray1, oneDimensionalArray2, oneDimensionalArray3};
		
		//Printing elements of Two Dimensional Array
        for (int i = 0; i < twoDimensionalArray.length; i++)
        {
            for (int j = 0; j < twoDimensionalArray[i].length; j++)
            {
                System.out.print(twoDimensionalArray[i][j]+"\t");
            }
            System.out.println();
        }
	}
	
	public static void jaggedArrays1() {
		
		int[][] jaggedTwoDimensionalArray = new int[5][];
		
		 int[] OneDimensionalArray1 = {1, 2, 3};
		 int[] oneDimensionalArray2 = {4, 5, 6, 7};
		 int[] oneDimensionalArray3 = {8, 9, 10, 11, 12};
		 
		//Initializing elements of Jagged Array
		 
	        jaggedTwoDimensionalArray[0] = OneDimensionalArray1;
	 
	        jaggedTwoDimensionalArray[1] = oneDimensionalArray2;
	 
	        jaggedTwoDimensionalArray[2] = oneDimensionalArray3;
		 
		 
		 
	}

}
