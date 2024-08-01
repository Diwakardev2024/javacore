package practiceforJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.StringJoiner;

public class practicalExample {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(3,7,8,1,5,9);
		Integer reduceSum=numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println(reduceSum);
		
		Optional<Integer> reduceSumWithMethodeReference=numbers.stream().reduce(Integer::sum);
		System.out.println(reduceSumWithMethodeReference);
		System.out.println(reduceSumWithMethodeReference.get());
		
		
		List<String> wordList=Arrays.asList("Apple","Banana","orange","Guava","pineApple","Banana");
		Spliterator<String> split1=wordList.spliterator();
		Spliterator<String> split2=split1.trySplit();
		split1.forEachRemaining(System.out::println);
		System.out.println("Traversing the other half of the spliterator..");
		split2.forEachRemaining(System.out::println);
		
		StringJoiner joiner=new StringJoiner(",");
		joiner.add("Gaurav");
		joiner.add("Tammy");
		joiner.add("Harsh");
		System.out.println(joiner);
		
	}

}
