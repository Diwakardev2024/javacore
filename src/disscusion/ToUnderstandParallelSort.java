package disscusion;

import java.util.Arrays;
import java.util.Random;

public class ToUnderstandParallelSort {
	
	public static void main(String[] args) {
		
		int arraySize = 100_000_000;
		byte[] largeArray = new byte[arraySize];
		Random random = new Random();
		random.nextBytes(largeArray);
		byte[] largeArrayCopy = Arrays.copyOf(largeArray, largeArray.length);

		// Measure time taken by parallelSort
		long parallelStartTime = System.nanoTime();
		Arrays.parallelSort(largeArray);
		long parallelEndTime = System.nanoTime();
		long parallelDuration = parallelEndTime - parallelStartTime;
		
		 // Measure time taken by sort
        long sortStartTime = System.nanoTime();
        Arrays.sort(largeArrayCopy);
        long sortEndTime = System.nanoTime();
        long sortDuration = sortEndTime - sortStartTime;
        
     // Print the durations
        System.out.println("Time taken by Arrays.parallelSort: " + (parallelDuration / 1_000_000) + " ms");
        System.out.println("Time taken by Arrays.sort: " + (sortDuration / 1_000_000) + " ms");

	}

}
