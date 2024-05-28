package java8Features;

import java.util.Arrays;
import java.util.List;

public class FindOutNumberStartsWith {

//	 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,15,8,49,25,98,132);
		list.stream().map(s->s+" ").filter(x->x.startsWith("1")).forEach(y -> System.out.print(y+" "));
		
			
	}
}
