package java8Features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

//	Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

	public boolean containsDuplicate(int[] nums) {
		
		List<Integer> list=Arrays.stream(nums).boxed()
				.collect(Collectors.toList());
		Set<Integer> set=new HashSet<>(list);
		if(set.size()==list.size())
			return false;
		return true;
	}
	
	
	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		ContainsDuplicate con=new ContainsDuplicate();
		System.out.println(con.containsDuplicate(nums));
		
		
		
	}
}
