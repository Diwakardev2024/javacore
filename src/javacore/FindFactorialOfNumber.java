package javacore;

public class FindFactorialOfNumber {

	public int factorial(int n) {
		if (n == 1)
			return 1;
		else
			System.out.print(n + " * ");
		return n * factorial(n - 1);

	}

	public static void main(String[] args) {
		FindFactorialOfNumber fact = new FindFactorialOfNumber();
		System.out.print(1 + " = " + fact.factorial(5));
	}
}
