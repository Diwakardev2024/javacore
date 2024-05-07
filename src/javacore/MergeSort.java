package javacore;

// Write a Java program that illustrates merge sort.

	public class MergeSort {
	    public static void mergeSort(int[] arr) {
	        if (arr == null || arr.length <= 1) {
	            return; // Base case: array is already sorted or empty
	        }
	        mergeSort(arr, 0, arr.length - 1);
	    }

	    private static void mergeSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int mid = low + (high - low) / 2;
	            mergeSort(arr, low, mid); // Sort the left half
	            mergeSort(arr, mid + 1, high); // Sort the right half
	            merge(arr, low, mid, high); // Merge the sorted halves
	        }
	    }

	    private static void merge(int[] arr, int low, int mid, int high) {
	        int leftLength = mid - low + 1;
	        int rightLength = high - mid;

	        int[] leftArray = new int[leftLength];
	        int[] rightArray = new int[rightLength];

	        // Copy data to temp arrays
	        for (int i = 0; i < leftLength; i++) {
	            leftArray[i] = arr[low + i];
	        }
	        for (int j = 0; j < rightLength; j++) {
	            rightArray[j] = arr[mid + 1 + j];
	        }

	        // Merge the temp arrays
	        int i = 0, j = 0;
	        int k = low;
	        while (i < leftLength && j < rightLength) {
	            if (leftArray[i] <= rightArray[j]) {
	                arr[k] = leftArray[i];
	                i++;
	            } else {
	                arr[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy remaining elements of leftArray[], if any
	        while (i < leftLength) {
	            arr[k] = leftArray[i];
	            i++;
	            k++;
	        }

	        // Copy remaining elements of rightArray[], if any
	        while (j < rightLength) {
	            arr[k] = rightArray[j];
	            j++;
	            k++;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 11, 13, 5, 6, 7};
	        mergeSort(arr);

	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}


