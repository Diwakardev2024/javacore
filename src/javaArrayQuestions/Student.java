package javaArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Student {

	private String name;
	private int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public Student(String name, int i) {
		this.name = name;
		this.marks = i;
	}

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("Ramesh", 50));
		list.add(new Student("Sudhanshu", 85));
		list.add(new Student("Samesh", 59));
		list.add(new Student("Anshuman", 86));

		for (Student t : list) {
			System.out.println(t.getName() + " : " + t.getMarks());
		}

//		list.stream().filter(x->x.getMarks()>80).forEach(y->System.out.println(y.getName()+""));
		System.out.println();
		list.stream().filter(x -> x.getMarks() > 80).forEach(y -> System.out.println(y.getName() + ":" + y.getMarks()));

		List<Student> output = list.stream().filter(x -> x.getMarks() > 80).collect(Collectors.toList());

		System.out.println(output);

		List<Student> out = list.stream().filter(x -> x.getMarks() > 80).collect(Collectors.toList());
		System.out.println(out);
		System.out.println();

		List<String> li = new ArrayList<>();

		for (Student x : out) {
			String y = x.getName();
			li.add(y);

		}
		System.out.println(li);
//		list.stream().filter(x -> x.getMarks() > 80)
		
		List<String> listStr = Arrays.asList("Suman","Prakash","SumanSingh","PradumanGhosh");
		// [sumansingh]
		
//	listStr.stream().map(x->x.length()>6 && x.startsWith("S") ).forEach(System.out::println);
		
		Predicate<Student> x=y->y.getName()!=null;
		Function<Student,String> name= new Function<Student, String>() {
			
			@Override
			public String apply(Student t) {
				// TODO Auto-generated method stub
				return t.getName();
			}
		};
		Function<Student,String> name1=y->y.getName();
	list.stream().filter(x).collect(Collectors.toList());
	
	List<String> nameOfStudent=	list.stream().map(name1).collect(Collectors.toList());
	
	System.out.println(nameOfStudent);
	}

}
