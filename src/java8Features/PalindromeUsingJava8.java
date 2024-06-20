package java8Features;

import java.util.stream.IntStream;

// ) Palindrome program using Java 8 streams

public class PalindromeUsingJava8 {
	
	public static void main(String[] args) {
		
		String str="ROTATORS";
//		String str="JAAJ";
		
		boolean isItPalindrome=IntStream.range(0, str.length()/2)
								.noneMatch(i->str.charAt(i) !=str.charAt(str.length()-i-1));
		
		if(isItPalindrome)
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+"  is not a palindrome");
	}

}
