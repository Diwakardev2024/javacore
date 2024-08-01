package markerInterface;

import java.io.Serializable;

public class MarkerInterfaceExample {
	
	public static void main(String[] args) {
		
		MyClass myObject=new MyClass("Example data");
		
		if(myObject instanceof Serializable) {
			System.out.println("The object is serializable");
		}
		else {
			System.out.println("The objects is not serializable");
		}
		
		// Entity
		
		ShapeDao sh=new ShapeDao();
		sh.delete(myObject);
		
	}

}
