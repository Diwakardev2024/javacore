package java8Features;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
	
//	  Given the list of integers, find the first element of the list using Stream functions?
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(15,8,49,25,98,98,32,15);
		list.stream().skip(3).findFirst().ifPresent(r -> System.out.println(r));
		
	}

}
