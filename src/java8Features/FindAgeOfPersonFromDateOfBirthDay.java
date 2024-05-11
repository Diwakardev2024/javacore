package java8Features;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Find the age of a person in years if the birthday has given?

public class FindAgeOfPersonFromDateOfBirthDay {

	public static void main(String[] args) {
		
		LocalDate birthDay=LocalDate.of(1989, 02,8);
		LocalDate today=LocalDate.now();
		
		System.out.println(ChronoUnit.YEARS.between(birthDay, today));
	}
}
