package java8Features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElements {
	
//	How to find duplicate elements in a given integers list in java using Stream functions?
	
	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(10,20,25,30,25,98,98,100,100);
		Set<Integer> set=new HashSet<>();
		list.stream().filter(n -> !set.add(n)).forEach(y->System.out.print(y+" "));
	
	}

}
