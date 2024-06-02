package java8Features.OptinalDemo;

import java.util.Objects;

public class TocheckImmutabilityOfString {
	
	@Override
	public int hashCode() {
		return Objects.hash(age, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TocheckImmutabilityOfString other = (TocheckImmutabilityOfString) obj;
		return age == other.age ;
	}

	private int age;
	private int size;
	
	public TocheckImmutabilityOfString(int s) {
		this.age = s;
		
	}
	
	public static void main(String[] args) {
		
		TocheckImmutabilityOfString s1=new TocheckImmutabilityOfString(8);
		TocheckImmutabilityOfString s2=new TocheckImmutabilityOfString(81);
		
		if(s1==s2) {
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		if(s1.equals(s2)) {
			System.out.println("true");
		}
		else
			System.out.println("False");
		
		
		// 2
		
//		String s3="prabhakar";
//		String s3="kumar";
//		
//		if(s3==s3)
//		System.out.println(s3);
	}

}
