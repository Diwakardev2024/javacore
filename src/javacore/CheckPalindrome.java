package javacore;

//  How do you check whether a string is a palindrome in Java?

public class CheckPalindrome {

	public void palindrome(String str) {

		String s = "";
		String s1 = str.toLowerCase();

		for (char ch : s1.toCharArray()) {

			s = ch + s;

		}
		
		System.out.println(s.toString());
		
		if (s.equals(str.toLowerCase()))
			System.out.println("String is Palindrome ");
		else
			System.out.println("String is not Palindrome");
	}
	
	// 2nd approach ---
	
	boolean checkPalindromeString(String input) {
		boolean result = true;
		int length = input.length();

		for (int i = 0; i < length/2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}

		return result;
	}
	
	

	public static void main(String[] args) {
		CheckPalindrome check = new CheckPalindrome();
		check.palindrome("Sanju");
	}
}
