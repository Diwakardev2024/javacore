package disscusion;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// How do you find common elements between two arrays?

public class CommonElementsBEtweenTwoArrays {
	
	public static void main(String[] args) {
		

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 56,56,28);
        List<Integer> list2 = Arrays.asList(12, 56,56, 17, 21, 94, 34);
        list2.stream().filter(list1::contains).forEach(System.out::println);
        
        Function<Integer, Stream<Integer>> func = num-> list2.stream();
        
        List<Integer> output = Stream.of(list1,list2).flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(output);
        
        
		
	}

}
//The method flatMap(Function<? super Integer,? extends Stream<? extends R>>) in the type Stream<Integer> is not applicable for the arguments ()