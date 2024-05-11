package javacore.inheritance;

//  How do you show a diamond problem with multiple inheritance in Java?


/*
 * The diamond problem occurs when a class inherits from multiple classes and ambiguity occurs 
 * when it’s unclear which method to execute from which class. 
 * Java doesn’t allow extending multiple classes to avoid the diamond problem
 */

public interface I {
	
	void foo();

}

class A implements I{

	@Override
	public void foo() {
		
		System.out.println("A");
		
	}
	
}

class B implements I {

	@Override
	public void foo() {

		System.out.println("B");
	}
	
}

/*
 * class C extends A,B { // will not compile
 * 
 * public void bar() { super.foo(); } }
 */