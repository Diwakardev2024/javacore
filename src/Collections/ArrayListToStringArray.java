package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToStringArray {

	public static void method() {
		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("Anshul Aggarwal");
		a1.add("Mayank Solanki");
		a1.add("Abhishek Kelenia");
		a1.add("Vivek Gupta");

		 String[] answer = Arrays.copyOf(a1.toArray(), a1.size(), String[].class);
		 System.out.println(Arrays.toString(answer));
//		String[] str = new String[a1.size()];
		String z[] = a1.toArray(new String[a1.size()]);
		System.out.println(Arrays.toString(z));
		

		/*
		 * for (int i = 0; i < a1.size(); i++) { str[i] = a1.get(i); }
		 */

//		for (String k : z) {
//			System.out.println(k);
//		}

	}
	
	public static void main(String[] args) {
		method();
	}

}
