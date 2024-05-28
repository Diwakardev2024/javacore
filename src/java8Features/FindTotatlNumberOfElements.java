package java8Features;

import java.util.Arrays;
import java.util.List;

public class FindTotatlNumberOfElements {
	
//	  Given a list of integers, find the total number of elements present in the list using Stream functions?
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,15,8,49,25,9,8,98,15);
		long count=list.stream().count();
		System.out.println(count);
	}

}
