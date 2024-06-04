package Collections;

import java.util.function.Predicate;

public class Abc {
	
	Predicate<String> p=new Predicate<String>() {
		
		@Override
		public boolean test(String t) {
		System.out.println("Test is conducted");
			return false;
		}
	};
	
//	class Test implements Predicate<String>{
//		
//	}

}
