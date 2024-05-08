package javacore;

// How do you find the second largest number in an array in Java?

public class FindSecondHighestNumber {

	public int findSecondHighest(Integer[] array) {
		int highest = Integer.MIN_VALUE;
		int SecondHighest = Integer.MIN_VALUE;

		for (Integer i : array) {
			if (i > highest) {
				SecondHighest = highest;
				highest = i;
			} else if (i > SecondHighest) {
				SecondHighest = i;
			}

		}
		return SecondHighest;
	}

	public static void main(String[] args) {
		Integer[] array = { 15, 8, 9, 5, 40, 55, 2, 66 };
		FindSecondHighestNumber second = new FindSecondHighestNumber();
		System.out.println(second.findSecondHighest(array));
	}
}
