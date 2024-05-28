package java8Features;

import java.util.Arrays;
import java.util.List;

public class PrintAllEvenNumbers {
	
//	Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,15,20,21,22,24,36,98);
		
		list.stream().filter(x->x%2==0).forEach(x->System.out.print(x+" "));
		
	}

}
