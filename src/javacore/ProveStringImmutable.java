package javacore;

// Can you prove that a String object in Java is immutable programmatically?

public class ProveStringImmutable {
	
	public static void main(String[] args) {
		
		String s1="Java";
		String s2=s1;
		System.out.println(s1==s2);
		
		 s1="Python";
		 
		//s1 value got changed above, so how String is immutable?

		//in the above case a new String "Python" got created in the pool
		//s1 is now referring to the new String in the pool 
		//BUT, the original String "Java" is still unchanged and remains in the pool
		//s2 is still referring to the original String "Java" in the pool

		// proof that s1 and s2 have different reference
		 System.out.println(s1==s2);
		 
		 System.out.println(s2);
			
	}

}
