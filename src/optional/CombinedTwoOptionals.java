package optional;

import java.util.Optional;

public class CombinedTwoOptionals {
	
	public static Optional<Integer> sumOfOptional(Optional<Integer> optional1, Optional<Integer> optional2){
		
		if(optional1.isPresent() && optional2.isPresent()) {
			return Optional.of(optional1.get()+optional2.get());
		}
		else {
			return Optional.empty();
		}
		
	
	}
	
	public static void main(String[] args) {
		Optional<Integer> optional1=Optional.of(10);
		Optional<Integer> optional2=Optional.of(20);
		
		System.out.println(sumOfOptional(optional1, optional2));
		
	optional1=Optional.empty();
	optional2=Optional.of(20);
	
	System.out.println(sumOfOptional(optional1, optional2));
		
		
	}
	

}
