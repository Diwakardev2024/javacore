package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintMultiplesOf5FromTheList {

	public static void main(String[] args) {

		List<Integer> listOfInteger = Arrays.asList(4, 5, 25, 30, 60, 8, 65, 15, 64, 69);
		System.out.println(listOfInteger);

		String list = listOfInteger.stream().filter(i -> i % 5 == 0).map(String::valueOf).collect(Collectors.joining(","));

		List<Integer> integerList = Arrays.stream(list.split(",")).map(Integer::parseInt).collect(Collectors.toList());

		System.out.println(integerList);
	}

}
