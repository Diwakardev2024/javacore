package javacore;

// How do you remove spaces from a string in Java?

public class RemoveSpacesFromString {

	public void removeSpace(String s) {
		
		StringBuilder sb=new StringBuilder();
		char[] charArray=s.toCharArray();
		for(char c : charArray) {
			if(!Character.isWhitespace(c))
				sb.append(c);
		}
		System.out.println(sb.toString());
		
	}
	
	public static void main(String[] args) {
		RemoveSpacesFromString rm=new RemoveSpacesFromString();
		rm.removeSpace("Diwa  kar kumar");
	}
}

/*
 * String removeWhiteSpaces(String input) { StringBuilder output = new
 * StringBuilder();
 * 
 * char[] charArray = input.toCharArray();
 * 
 * for (char c : charArray) { if (!Character.isWhitespace(c)) output.append(c);
 * }
 * 
 * return output.toString(); }
 */