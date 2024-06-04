package staticblocks;

public class JavaFundamental {
	// explain about public static void main(String[]args)
	/*
	 * public :- access modifier
	 * 
	 * static :- keyword , main() method i.e static in nature
	 * 
	 * void :- main() method returns nothing
	 * 
	 * String arg[]:-It is the parameter passed to main()
	 * 
	 * main():- It is usually the starting point of Java programs; but there are exception
	 
	 */
	
	// Autoboxing :-
	/*
	 * When the Java compiler automatically transforms the primitive type(int,float,double etc.)
	 * into their object equivalents or wrapper type(Integer,Float and Double);then it is called autoboxing
	 * 
	 */

	// Unboxing :- 
	/*
	 * The automatic transforming of wrapper types (Integer,Float & Double) into their primitive equivalent(int,float,double)
	 *is known as Unboxing.
	 *
	 * example: class Abc{
	 * public static void myMethod(Integer num){
	 * System.out.println(num)
	 * }
	 * public static void main(String[] args){
	 *   myMethod(2);
	 *   
	 *   Integer i=new Integer(10);
	 *   int i1=i; // Unboxing
	 *      
	 *   }
	 *  }
	 */
}
