package javacore;

//  Write a Java program to check if the given number is a prime number.

public class ToCheckGivenNumberIsPrimeNumber {

	public boolean checkPrime(int number) {

		System.out.println("Given Number : " + number);
		if (number == 0 || number == 1)
			return false;
		else if (number == 2)
			return true;
		else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0)
					return false;

			}
		}

		return true;

	}

	public static void main(String[] args) {

		ToCheckGivenNumberIsPrimeNumber check = new ToCheckGivenNumberIsPrimeNumber();
		System.out.println("Number is prime : " + check.checkPrime(1468551));

	}

}
