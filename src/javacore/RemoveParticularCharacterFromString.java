package javacore;

// How do you remove all occurrences of a given character from an input string in Java?

public class RemoveParticularCharacterFromString {
	
	public static void main(String[] args) {
		
		String str1 = "abcdABCDabcdABCD";
		
		str1 = str1.replace("D", ""); 

		System.out.println(str1); // bcdABCDbcdABCD
	}

}
