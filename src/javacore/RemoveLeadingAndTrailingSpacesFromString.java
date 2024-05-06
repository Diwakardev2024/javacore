package javacore;

public class RemoveLeadingAndTrailingSpacesFromString {
	
	public static void main(String[] args) {
		
		/*
		 * The String class contains two methods to remove leading and trailing whitespaces: trim() and strip(). 
		 * The strip() method was added to the String class in Java 11. 
		 * The strip() method uses the Character.isWhitespace() method to check if the character is a whitespace.
		 *  This method uses Unicode code points, while the trim() method 
		 *  identifies any character with a codepoint value less than or equal to U+0020 as a whitespace character.
		 */
		String s = "  abc  def\t";
		
		s = s.strip();
				
		System.out.println(s);
	}

}
