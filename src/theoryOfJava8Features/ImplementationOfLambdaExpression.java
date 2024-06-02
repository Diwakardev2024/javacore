package theoryOfJava8Features;

public class ImplementationOfLambdaExpression {
	
	public static void printFormatted(String str,StringFunction format) {
		
		String result =format.run(str);
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// without lambda expression
		
		Printable printbale=new Printable() { // Anonymous class object of printable interface
			
			@Override
			public void print(String msg) {
				
				System.out.println(msg);
			}
		};
		
		printbale.print("Print message to console....");
		
		// with lambda expression
		
		Printable withLambda=(msg)->System.out.println(msg);
		withLambda.print("Print message to console...");
		
		
		// implementation of Annonymous class
		
		StringFunction exclaim=(s)->s+"!";
		StringFunction ask =(s)->s+"?";
		
		
		
	}

}
 interface Printable{
	 void print(String msg);
 }
 
 interface StringFunction{
	 
	 String run(String str);
	 
 }