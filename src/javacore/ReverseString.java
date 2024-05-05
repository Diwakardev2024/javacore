package javacore;

// How do you reverse a string in Java?

public class ReverseString {

	public void reverseString(String str) {
		String s = str;
		String s2 = "";
		if (s == null)
			throw new IllegalArgumentException("Null is not valid input");
		
		for (Character s1 : s.toCharArray()) {

			s2 = s1 + s2;

		}
		System.out.println(s2);
	}

	public static void main(String[] args) {

		ReverseString rever = new ReverseString();
		rever.reverseString("123");
		StringBuilder build = new StringBuilder();
		build.append("Diwakar").reverse();
		System.out.println(build);

	}

}
