package java8Features;

import java.util.stream.Stream;

// Write a Java 8 program to iterate a Stream using the forEach method?
public class ToIterateStream {
	
	public static void main(String[] args) {
		
		Stream.iterate(2, count->count+1).filter(number->number%2==0).limit(5).forEach(System.out::println);
		
		
	}
	

}
