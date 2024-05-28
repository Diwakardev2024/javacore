package javaIntermediateInterviewQuestions;

import java.util.regex.*;

public class UsingRegexPasswordValidator {

	public static boolean validatePassword(String password) {
		String regex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

	public static void main(String[] args) {
		String password = "Your@Password123";
		if (validatePassword(password)) {
			System.out.println("Valid password");
		} else {
			System.out.println("Invalid password");
		}
	}
}
