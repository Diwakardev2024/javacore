package singletonDesignPattern;

public enum Singleton {
	
	INSTANCE;
	
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	

}

// 1. Classic Singleton : Eager Initialization 
// The instance is created at the time of class loading.

class ClassicSingleton {

	// Eagerly initialized instance

	private static final ClassicSingleton instance = new ClassicSingleton();

	// Private constructor to prevent instantiation
	private ClassicSingleton() {}

	// Private method to access the instance

	public static ClassicSingleton getInstance() {
		return instance;
	}

}

// 2. Singleton with Lazy Initialization (thread safe)
// The instance is created lazily to save resources. Thread-safe using double-checked locking.

class LazySingleton {
	
	// Double-checked locking for thread safety
	
	private static volatile LazySingleton instance;
	
	private LazySingleton() {}
	
	// Double-cheked locking for thread safety
	
	public static LazySingleton getInstance() {
		if(instance==null) {
			
			synchronized (LazySingleton.class) {
				
				if(instance==null) {
					instance = new LazySingleton();
				}
			}
		}
		
		return instance;
	}
	

}

// 3. Singleton with Bill Pugh Singleton Implementation (Thread safe)
// Utilizes a static inner helper class for lazy initialization with thread safety.

class BillPughSingleton{
	
	private BillPughSingleton() {}
	
	// Inner static helper class for lazy initialization
	private static class SingletonHelper {
		
	private static final BillPughSingleton instance=new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		
		return SingletonHelper.instance;
	}
	
}

// 4. Singleton with Enum (Thread-safe). Enum types have a natural way to provide a singleton.

 enum EnumSingleton {
	
	INSTANCE;
}




