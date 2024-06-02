package java8Features;

import java.util.stream.Stream;

public class IterateByUsingJava8 {
	
	public static void main(String[] args) {
		
		Stream.iterate(2, count ->count+1).filter(number -> number%2==0).limit(5)
		.forEach(System.out::println);
	}

}
