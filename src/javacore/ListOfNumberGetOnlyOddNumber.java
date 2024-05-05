package javacore;

import java.util.Arrays;
import java.util.List;

// How do you check if a list of integers contains only odd numbers in Java?

public class ListOfNumberGetOnlyOddNumber {
	
	public void oddNumber(List<Integer> list) {
		
		for(Integer in:list) {
			if(in==0)
				System.out.println("Not odd number : "+in);
			else
			{
				if(in %2 !=0)
					System.out.print(in+" ");
			}
		}
	}
public static void main(String[] args) {
	
	List<Integer> list=Arrays.asList(1,23,5,6,40,25,23,53);
	ListOfNumberGetOnlyOddNumber lt=new ListOfNumberGetOnlyOddNumber();
	lt.oddNumber(list);
}
}
