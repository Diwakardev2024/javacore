package javacore;

import java.util.ArrayList;
import java.util.List;

// How do you merge two lists in Java?

public class MergeLists {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("3");
		List<String> list2 = new ArrayList<>();
		list2.add("2");

		List<String> mergedList = new ArrayList<>(list1);
		mergedList.addAll(list2);
		System.out.println(mergedList); // [1, 2]
	}

}
