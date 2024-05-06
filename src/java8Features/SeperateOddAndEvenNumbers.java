package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateOddAndEvenNumbers { 
	
	public static void main(String[] args) {
		
		List<Integer> listOfIntegers=Arrays.asList(1,2,5,4,9,43,56,48,90,23);
		
	Map<Boolean, List<Integer>> list=	listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
		
		System.out.println(list); 
		
	}

}
