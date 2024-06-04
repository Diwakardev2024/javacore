package pawanClasses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Vehicles {

	public static void main(String[] args) {
		List<String> vehiclesList = Arrays.asList("bus", "car", "bycle", "bus", "car", "bike");

		List<String> distinctVehicles = vehiclesList.stream().distinct().collect(Collectors.toList());

		System.out.println(distinctVehicles);

		vehiclesList.stream().distinct().forEach(v -> System.out.println(v));
		vehiclesList.stream().distinct().toArray();

		List<Integer> numberList = Arrays.asList(1, 2, 3, 5, 64, 45, 78, 50, 9);

		Optional<Integer> max = numberList.stream().max((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(max.get());

List<String> stringList=Arrays.asList("B25","A","B","C","1","2","3","1A");
Optional<String> reduced=stringList.stream().reduce((value,combinedvalue)->{
	return combinedvalue+value;
});
List<String> reverseStringList=stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
System.out.println(reduced.get());

System.out.println(reverseStringList);


List<Integer> list1=Arrays.asList(2,4,5,6,1,60,6,7,9,11);
List<Integer> sortedList=list1.stream().sorted().collect(Collectors.toList());
System.out.println(sortedList);

List<Integer> reverseList=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 System.out.println(reverseList);
		
	}

}
