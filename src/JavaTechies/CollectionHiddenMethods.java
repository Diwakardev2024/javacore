package JavaTechies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionHiddenMethods {
	
	public static void main(String[] args) {
		
		// Collections.ncopies
		
		List<String> names=Collections.nCopies(5, "JavaTechie");
		System.out.println(names);
		
		try {
			names.set(0, "YouTube");
		}catch(UnsupportedOperationException e){
			System.out.println("List is immutable , it can't be modify");
		}
		
		// Collections.frequency
		List<Integer> numbers=Arrays.asList(1,2,3,4,3,1,2,4,5,6,7,4,6,6,1,2,6);
		Integer count=Collections.frequency(numbers, 6);
		System.out.println("6 Number of time : "+count);
		
		
		Map<Integer,Integer> countMap = numbers.stream()
		.collect(
				Collectors.toMap(
						number->number, 
						number->Collections.frequency(numbers, number), 
						(existingValue,newValue)->existingValue
						)
				);
		System.out.println(countMap);
		
		
		// Collections.disjoint()
		
		List<Integer> list1=new ArrayList<>();
		Collections.addAll(list1,1,2,3,4,5);
		
		List<Integer> list2=new ArrayList<>();
		Collections.addAll(list2,2,3,7,8,9,10);
		
		boolean areDisjoint=Collections.disjoint(list1, list2);
		
		if(areDisjoint) {
			System.out.println("This list have no common element");
		}else {
			System.out.println("This list have common element");
		}
		
		// Collections.singleton
		
		Set<String> myCollection=Collections.singleton("JavaTechie");
		
		try {
			
			myCollection.add("test data");
		}catch(UnsupportedOperationException e) {
			System.out.println("Set is immutable , it can't be modify");
		}
		
		// Collections.rotate()
		
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		System.out.println("Original list : "+list);
		
//		Collections.rotate(list, 3);
		
//		System.out.println(list);
		
		Collections.rotate(list, -4);

		System.out.println(list);
		
		List<Integer> list3=new ArrayList<>();
		for(int i=4;i<=15;i++) {
			list3.add(i);
		}
		System.out.println(list3);
//		Collections.rotate(list3, list3.size());
		System.out.println();
		Collections.rotate(list3, -15);
		System.out.println(list3);
		Collections.shuffle(list3);
		System.out.println(list3);
	}

}
