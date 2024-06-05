package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArraySublist {
 
	//IndexOutOfBoundsException,IllegalArgumentException 
	public static void method() {
		 try { 
			   ArrayList<String> arrlist = new ArrayList<String>(); 
	  
	          
	            arrlist.add("A"); 
	            arrlist.add("B"); 
	            arrlist.add("C"); 
	            arrlist.add("D"); 
	            arrlist.add("E"); 
	  
	          
	            System.out.println("Original arrlist: " + arrlist); 
	  	           
	            List<String> arrlist2 = arrlist.subList(2, 4); 
	          //  List<String> arrlist3 = arrlist.reversed();
//	            List<String> arrlist2 = arrlist.subList(7, 2); 
	  
	         
	            System.out.println("Sublist of arrlist: " + arrlist2); 
	            //System.out.println("Sublist of arrlist: " + arrlist3); 
	        } 
	  
	        catch (IndexOutOfBoundsException e) { 
	            System.out.println("Exception thrown : " + e); 
	        } 
		    catch(IllegalArgumentException e) {
		    	System.out.println("Exception thrown : "+e);
		    }
	}
	public static void main(String[] args) {
		method();
	}
}
