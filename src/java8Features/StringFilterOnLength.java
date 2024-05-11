package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Write a Java 8 program to find the number of Strings in a list whose length is greater than 5?

public class StringFilterOnLength {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Saket");
		list.add("Saurav");
		list.add("Softwaretestinghelp");
		
		Predicate<String> pre=(str)->{
			if(str.length()>5)
				return true;
			else 
				return false;
		};
		
		long count=list.stream().filter(num->pre.test(num)).count();
		
		System.out.println(count);
	}

}
