package java8Features;

import java.util.StringJoiner;

//  Write a Java 8 program to add prefix and suffix to the String?
public class StringJoinerToJoinCommasEtc {
	
	public static void main(String[] args) {
		
		StringJoiner stj=new StringJoiner(",", "(", ")");
		stj.add("Saket");
		stj.add("Jhon");
		stj.add("Franklin");
		stj.add("Ricky");
		stj.add("Trevor");
		
		System.out.println(stj);
	}

}
