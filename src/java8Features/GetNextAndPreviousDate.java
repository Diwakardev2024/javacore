package java8Features;

import java.time.LocalDate;

public class GetNextAndPreviousDate {
	
//	How to find next/previous(tomorrow/yesterday) date using Java 8?
	
	private static LocalDate getNextDay(LocalDate localdate) {

	    return localdate.plusDays(1);
	}

	private static LocalDate getPrevDay(LocalDate localdate) {

	    return localdate.minusDays(1);
	}
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
        LocalDate tomorrow = today.plusDays(1);
        
		System.out.println(getNextDay(today));
		
		System.out.println(getNextDay(tomorrow));
		System.out.println(tomorrow.getDayOfMonth());
	}

}
