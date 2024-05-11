package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

// Write a Java 8 program to square the list of numbers and then filter out the
//numbers greater than 100 and then find the average of the remaining numbers?

public class SquareNumberFilterTheNumber {
	
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] { 100, 100, 9, 8, 200 };
		List<Integer> list=Arrays.asList(arr);
		
//		list.stream().map(i->i*i).filter(j->j>100).forEach(System.out::println);
		OptionalDouble avg = list.stream().mapToInt(n -> n * n).filter(n -> n >100).average();		
		System.out.println(avg);
		
		if (avg.isPresent())
			 System.out.println(avg.getAsDouble());
	}

}
