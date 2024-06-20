package oopsConcept.abstraction;

	public class Main {
	    public static void main(String[] args) {
	        A a = new A();
	        System.out.println(a.getResult(null));  // Output: Result from class A

	        B b = new B();
	        System.out.println(b.getResult(null));  // Output: Result from class B

	        B1 b1 = new B1();
	        System.out.println(b1.getResult(null));  // Output: Result from class B1
	        
	        B2 b2 = new B2();
	        System.out.println(b2.getResult(null));  // Output: Result from class B1
	    }
	    
	}

