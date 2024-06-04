package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {
		int arr[] = {12,5,9,2,8,21,11};
		String str[] = {"Java", "HashMap","LinkedHashMap"};
		
//		getRangeLimit();
		findCharFrequency("dsuahfpweowefuoinfwui");
	}

	static void findCharFrequency(String str) {
		Map<String, Long> map = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		

		System.out.println(map);

	}
	
	static void findDuplicateChar(String str) {
		List<String> list  = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(elt -> elt.getValue() > 1)
		.map(item -> item.getKey())
		.collect(Collectors.toList());
		
		System.out.println(list);
	}
	
	static void findFirstNonRepeating(String str) {
		String output  = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(elt -> elt.getValue() == 1)
		.findFirst()
		.get().getKey();
		
		System.out.println(output);
	}
	
	static void findSecondHighestNum(int[] arr) {
		
		List<Integer> list = Arrays.stream(arr)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(list);
		// MAX element
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
		// Second Max Element
		Integer secondMax = Arrays.stream(arr)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		System.out.println(secondMax);
	}
	
	static void findLongestString(String[] arr) {
		System.out.println(Arrays.toString(arr));
		String longestString = Arrays.stream(arr)
		.reduce((x,y)-> x.length() > y.length() ? x : y).get();
		System.out.println(longestString);
	}
	
	static void findNumStartsWith(int[] arr, String startWith) {
		List<String> output = Arrays.stream(arr)//IntStream
		.boxed()// Stream<Integer>
		.map(String::valueOf)
		.filter(s -> s.startsWith(startWith))
		.collect(Collectors.toList());
		
		System.out.println(output);
	}
	
	static void joinString(String[] str) {
		List<String> list = Arrays.asList(str);
		String output = String.join("-", list);
		System.out.println(output);
	}
	
	static void getRangeLimit() {
		for (int i = 0; i < 10; i++) {
			System.out.print("i:"+i+" ");
		}
		System.out.println();
		IntStream.range(0, 10).forEach(item -> {
			System.out.print("item: "+ item);
		});
		System.out.println();
		IntStream.rangeClosed(0, 10).forEach(item -> {
			System.out.print("item: "+ item);
		});
		System.out.println();
		// 2-9
		IntStream.rangeClosed(0, 10)
		.skip(1)
		.limit(9)
		.forEach(item -> {
			System.out.print("item: "+ item);
		});
	}
}
