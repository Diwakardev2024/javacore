package oopsConcept.abstraction;

import java.util.ArrayList;
import java.util.List;

public abstract class MyAbstractGeneric<TValue1, TValue2 extends String, TValue3> {
	
    public abstract void method1(TValue1 value);
    public abstract String method2(TValue2 value);
    public abstract TValue3 method3(TValue3 value);
}


 class ConcreteClassA extends MyAbstractGeneric<Integer, String, Boolean> {
    @Override
    public void method1(Integer value) {
        System.out.println("Integer value: " + value);
    }

    @Override
    public String method2(String value) {
        return "Received: " + value;
    }

    @Override
    public Boolean method3(Boolean value) {
    	int[] arr = {};
//    	printArray(arr);
        return !value;
    }
    public static < E > void printArray(E[] elements) {  
        for ( E element : elements){          
            System.out.println(element );  
         }  
         System.out.println();  
    }  
}
 
 class ConcreteClassB extends MyAbstractGeneric<String, String, Integer> {
	    @Override
	    public void method1(String value) {
	        System.out.println("String value: " + value);
	    }

	    @Override
	    public String method2(String value) {
	        return "Handled: " + value;
	    }

	    @Override
	    public Integer method3(Integer value) {
	        return value * 2;
	    }
	    
	    
	    
	}