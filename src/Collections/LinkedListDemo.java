package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	
	public static void method() {
		LinkedList<String> list=new LinkedList<String>();
		
		  list.add("Geeks"); 
	      list.add("for"); 
	      list.add("Geeks"); 
	      list.add("10"); 
	      list.add("20"); 
	      
	      System.out.println("LinkedList:" + list);
	      System.out.println("The element is: " + list.get(2)); 
		
	}
	public static void method1() {
		LinkedList<String> list=new LinkedList<String>();
		    list.add("Geeks"); 
	        list.add("for"); 
	        list.add("Geeks"); 
	        list.add("10"); 
	        list.add("20"); 
	        
	        System.out.println("The list is : "+list);
	        
	        list.add("Last");
	        list.add("Element");
	        list.add(2,"Java");
	        
	        ListIterator<String> list_Iter = list.listIterator(2); 
	        System.out.println("The list is as follows:"); 
	        while(list_Iter.hasNext()){ 
	           System.out.println(list_Iter.next()); 
	        } 
	        
	        
	        System.out.println("The new List is : "+ list);
	        System.out.println("\nDoes the List contains 'Hello': "+ list.contains("Hello"));
	        System.out.println("Does the List contains 'Geeks': "+ list.contains("Geeks"));
	        System.out.println("The Object that is replaced is: " + list.set(2, "GFG"));
//	        list.clear(); 
	        System.out.println("The new List is : "+ list);
	}
	
public static void main(String[] args) {
//	method();
	method1();
}
}
