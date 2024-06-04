package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArraylist {
	
	public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) {
		ArrayList<Integer> revArrayList=new ArrayList<Integer>();
		for(int i=alist.size()-1;i>=0;i--) {
			revArrayList.add(alist.get(i));
		}
		return revArrayList;
	}
	public static void printElements(ArrayList<Integer> alist) {
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i)+" ");
		}
	}
	
	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        System.out.print("Original ArrayList: " );
	        printElements(list);
	       list=reverseArrayList(list);
	        System.out.print("Reversed ArrayList: ");
	        printElements(list);
	}
}
