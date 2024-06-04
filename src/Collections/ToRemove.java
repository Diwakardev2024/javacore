package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ToRemove {

	public static void method() {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);

		System.out.println(al);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			int x = (Integer) itr.next();
			if (x < 10)
				itr.remove();
		}
		System.out.println(al);
	}
	
	public static void method2() {
		try
		{ArrayList<Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		arrlist.add(5);
		
		System.out.println("Before operation : "+arrlist);
		
		int i=arrlist.set(3,30);
		
		System.out.println("After operation : "+arrlist);
		
		System.out.println("Replaced element : "+i);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception thrown: "+e);
		}
		
				
	}
	
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
		 ArrayList<T> newList=new ArrayList<T>();
		 
		 for(T element :list) {
			 if(newList.contains(element))
				 newList.add(element);
		 }
		return newList;
	}

	public static void main(String[] args) {
		method();
		method2();
		
		ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(1,10,1,2,3,3,10,3,4,5,5));
		System.out.println("ArrayList with duplicates :"+list);
		
		ArrayList<Integer> newList=removeDuplicates(list);
		System.out.println("ArrayList with duplicates removed : "+newList);
		
	}
}
