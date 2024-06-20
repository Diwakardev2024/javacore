package oopsConcept.abstraction;

public abstract class ExampleOfAbstraction1<T> {

	protected abstract <R extends T> R getResult(T t);

}

class A extends ExampleOfAbstraction1<Integer> {

	@Override
	protected <R extends Integer> R getResult(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

class B extends ExampleOfAbstraction1<Integer> {

	
	@Override
	protected <R extends Integer> R getResult(Integer t) {
		// TODO Auto-generated method stub
		return null;
	}

}

class B1 extends ExampleOfAbstraction1<Integer> {

	
	@Override
	protected <R extends Integer> R getResult(Integer t) {
		// TODO Auto-generated method stub
		return null;
	}
}

class B2 extends ExampleOfAbstraction1<Character> {

	
	@Override
	protected <R extends Character> R getResult(Character t) {
		// TODO Auto-generated method stub
		return null;
	}

}
