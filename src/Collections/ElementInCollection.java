package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementInCollection {
	public static void main(String[] args) {
		List<String> collection = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "grape"));
		String elementToCheck = "banana";
		if (collection.contains(elementToCheck)) {
			System.out.println("'" + elementToCheck + "' is part of the collection.");
		} else {
			System.out.println("'" + elementToCheck + "' is not part of the collection.");
		}
	}
}
