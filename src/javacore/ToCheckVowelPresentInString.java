package javacore;

//  Write a Java program to check if a vowel is present in a string.

public class ToCheckVowelPresentInString {
	
	public boolean checkVowel(String str) {
		
		System.out.println(str);
		
		return str.toLowerCase().matches(".*[aeiou].*");
	}
	
	public static void main(String[] args) {
		ToCheckVowelPresentInString check=new ToCheckVowelPresentInString();
		System.out.println("Vowels are included : "+check.checkVowel("Sanjau"));
	}
}
