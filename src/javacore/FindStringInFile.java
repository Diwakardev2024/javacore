package javacore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// How can you find a string in a text file in Java?

public class FindStringInFile {
	
//	to use the Scanner class to read the file contents line by line and then use the String contains() 
//	method to check if the string is present in the file.
	
	boolean findStringInFile(String filePath, String str) throws FileNotFoundException {
		
		File file = new File(filePath);

		Scanner scanner = new Scanner(file);

		// read the file line by line
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.contains(str)) {
				System.out.println(line);
				scanner.close();
				return true;
			}
		}
		scanner.close();

		return false;
	}
	public static void main(String[] args) throws FileNotFoundException {
		FindStringInFile string=new FindStringInFile();
		System.out.println(string.findStringInFile("C:\\Users\\Prabhakar\\Desktop\\AskedQuestions.txt", "loose"));
	}

}
