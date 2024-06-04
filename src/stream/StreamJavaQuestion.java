package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamJavaQuestion {

	public static void main(String[] args) {
		int arr[] = { 12, 5, 9, 2, 8, 21, 11, 4, -2, 5, -20, 0 };
		String str1[] = {"Java", "HashMap","LinkedHashMap"};
		String str = "ijklmijes";
		findFrequencyOfChar(str);
		findDuplicatesChars(str);
		findFirstNonRepeatingChar(str);
		findSecondHighestNumber(arr);
		findlongestString(str1);
	}

	static void findFrequencyOfChar(String str) {

		Map<String, Long> map = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(map);

	}

	static void findDuplicatesChars(String str) {

		List<String> list = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).map(item -> item.getKey()).collect(Collectors.toList());

		System.out.println(list);
	}

	static void findFirstNonRepeatingChar(String str) {

		String nonrepearting = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
		System.out.println(nonrepearting);
	}

	static void findSecondHighestNumber(int[] arr) {

		List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
		System.out.println(list);

		Integer num = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println(num);

		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);

		List<Integer> list2 = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());

		System.out.println(list2);

	}

	static void findlongestString(String[] str) {

		System.out.println(Arrays.toString(str));
		String longestString = Arrays.stream(str).reduce((x, y) -> x.length() > y.length() ? x : y).get();
		System.out.println(longestString);
	}

}
