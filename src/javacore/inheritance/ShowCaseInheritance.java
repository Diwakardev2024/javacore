package javacore.inheritance;

// Can you write some code to showcase inheritance in Java?
public class ShowCaseInheritance {
	
	String color;
public static void main(String[] args) {
	Cat c=new Cat();
	c.meow();
}
}
class Cat extends ShowCaseInheritance{
	void meow() {
		System.out.println("Meow");
	}
}
