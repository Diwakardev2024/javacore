package java8Features;

import java.util.Arrays;
import java.util.List;

public class FindmaximumValueElement {

//	  Given a list of integers, find the total number of elements present in the list using Stream functions?
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 9, 87);
		int max = list.stream().max((x, y) -> Integer.compare(x, y)).get();
		System.out.println(max);

	}

}
