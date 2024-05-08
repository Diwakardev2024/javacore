package javaIntermediateInterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Explain the FailFast iterator and FailSafe iterator along with examples for each.

public class FailFastIteratorIssue {

	public static void checkFailFast() {

		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			
			// this will not throw an exception
			if (entry.getKey() == 1) {
				map.remove(1);
			}
		}
	}
	
	public static void toCheckFailFast() {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			
			// this will throw a ConcurrentModificationException
			if (entry.getKey() == 1) {
				map.remove(1);
			}
		}
	}

	public static void main(String[] args) {
		
		checkFailFast();
//		 toCheckFailFast() ;

		
	}

}
