package singletonDesignPattern;

public class EnumDemo {
	
	public static void main(String[] args) {
		
		Singleton singleton=Singleton.INSTANCE;
		
		System.out.println(singleton.getValue());
		
		singleton.setValue(2);
		
		System.out.println(singleton.getValue());
	}

}
