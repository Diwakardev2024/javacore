package JavaTechies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import SortingWithComparator.Employee;

public class JavaStreamFeatures {

	public static void main(String[] args) {

		//

		List<String> names = Arrays.asList("Basant", "Santosh", null, "Vinod", null, "sam", "john");

		List<String> result = names.stream().filter(name -> name != null).collect(Collectors.toList());
		System.out.println(result);

		// use of Stream.ofNullable()

		List<String> nameResults = names.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
		System.out.println(nameResults);

		List<String> names1 = Arrays.asList();

		List<String> nameResult2 = names1.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
		System.out.println(nameResult2);

		// Stream.iterator()

		Stream.iterate(0, n -> n + 2).limit(5).forEach(System.out::println);

		// Collectors.collectingAndThen

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Alice", 50000));
		employees.add(new Employee("Bob", 65000));
		employees.add(new Employee("Charlie", 58000));
		employees.add(new Employee("sarah", 45000));
		employees.add(new Employee("Ali", 57000));

		Long employeeResult = employees.stream().mapToDouble(Employee::getSalary).boxed().collect(
				Collectors.collectingAndThen(Collectors.averagingDouble(Double::doubleValue), avg -> Math.round(avg)));

		System.out.println(employeeResult);

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> num1 = numbers.stream().takeWhile(num -> num < 5).collect(Collectors.toList());
		System.out.println(num1);

		List<Integer> num2 = numbers.stream().dropWhile(num -> num < 7).collect(Collectors.toList());
		System.out.println(num2);

		// Collectors.teeing()

		Map<String, Integer> minMaxMap = numbers.stream().collect(Collectors.teeing(

				Collectors.maxBy(Integer::compareTo), Collectors.minBy(Integer::compareTo),
				(e1, e2) -> Map.of("max", e1.get(), "Min", e2.get())));

		System.out.println(minMaxMap);

		// Collectors.partitioningBy()

		Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));

		System.out.println(map);
		System.out.println("odd number : " + map.get(Boolean.FALSE));
		System.out.println("even number : " + map.get(Boolean.TRUE));

		List<Integer> intStream1 = IntStream.range(1, 20).boxed().collect(Collectors.toList());
		System.out.println(intStream1);


		List<Integer> intStream2 = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
		System.out.println(intStream2);
		
//		let it be 
		int max=30,min=5;
		// Random number generator
		 int randomNumber=(int)((Math.random()*(max-min))+min); 
		 System.out.println(randomNumber);
		 
		 Random random = new Random();
		 int randomWithNextInt = random.nextInt();
	}

}
