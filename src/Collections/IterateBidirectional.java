package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterateBidirectional {
	public static void main (String[] args) {
        
	      List<Integer> list=new ArrayList<Integer>();
	      list.add(2);
	      list.add(5);
	      list.add(7);
	      System.out.println("Before reverse" + list);
	      /*You could  use the method listIterator(int index).
	      It allows you to place the iterator at the position defined by index.
	      */
	      ListIterator<Integer> iterator=list.listIterator(list.size());
	       
	      while(iterator.hasPrevious())
	      {
	        System.out.println(iterator.previous());
	      }
	}
}
