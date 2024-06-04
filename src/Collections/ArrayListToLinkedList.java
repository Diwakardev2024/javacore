package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListToLinkedList {

	public static void method() {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		LinkedList<Integer> linkedListFromArrayList = new LinkedList<>(arrayList);
		System.out.println("LinkedList obtained from ArrayList: " + linkedListFromArrayList);

		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(6);
		linkedList.add(7);
		linkedList.add(8);
		linkedList.add(9);
		linkedList.add(10);

		List<Integer> arrayListFromLinkedList = new ArrayList<>(linkedList);
		System.out.println("ArrayList obtained from LinkedList: " + arrayListFromLinkedList);
	}

	public static void main(String[] args) {
		method();
	}

}
