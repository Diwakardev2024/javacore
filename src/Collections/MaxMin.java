package Collections;

import java.util.*;

public class MaxMin {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(44);
		list.add(11);
		list.add(22);
		list.add(33);
		// Sort the collection and get the first and last element
		Collections.sort(list);
		System.out.println(list.get(0));
		System.out.println(list.get((list.size() - 1)));
		// Use max() and min() methods of COllections classs
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
 

		
		
	}
}
