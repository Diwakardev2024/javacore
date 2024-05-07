package javacore;

import java.util.Arrays;

// How do you implement a binary search in java ?

/*
 * The array elements must be sorted to implement binary search. 
 * The binary search algorithm is based on the following conditions:

1)If the key is less than the middle element, then you now need to search only in the first half of the array.

2)If the key is greater than the middle element, then you need to search only in the second half of the array.

3)If the key is equal to the middle element in the array, then the search ends.

4)Finally, if the key is not found in the whole array, then it should return -1. This indicates that the element is not present.
 */
public class ImlementBinarySearch {

	public static int binarySearch(int arr[], int low, int high, int key) {
		int mid = (low + high) / 2;

		while (low <= high) {
			if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] == key) {
				return mid;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}

		if (low > high) {
			return -1;
		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 25, 54, 8, 5, 7, 10, 4, 14, 2, 3, 4, 12, 58 };
		Arrays.sort(arr);
		for (int i : arr)
			System.out.print(i + " ");
		int high = arr.length - 1;
		System.out.println();
		ImlementBinarySearch imp = new ImlementBinarySearch();
	System.out.println("Index of Number is : "+imp.binarySearch(arr, 0, high, 58));
	}
}
