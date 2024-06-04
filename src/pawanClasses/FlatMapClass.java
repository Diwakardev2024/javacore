package pawanClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapClass {
	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2);
		List<Integer> list2=Arrays.asList(3,2);
		List<Integer> list3=Arrays.asList(4,5);
		List<Integer> list4=Arrays.asList(6,7);
		
		List<List<Integer>> finalList=Arrays.asList(list1,list2,list3,list4);
		
		
		List<Integer> finalResults=finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(finalResults);
		
		
		//=========
		
		List<Student> student1=new ArrayList<>();
		student1.add(new Student("Smith", 101, 'A'));
		student1.add(new Student("Jhon", 102, 'B'));
		student1.add(new Student("Kenedy",103,'c'));
		
		List<Student> student2=new ArrayList<>();
		student2.add(new Student("Scott", 104, 'A'));
		student2.add(new Student("Mary", 105, 'B'));
		student2.add(new Student("Kitty",106,'C'));
		
		List<List<Student>> studentList=Arrays.asList(student1,student2);
		
		List<Character> nameList=studentList.stream().flatMap(stud->stud.stream()).map(x->x.grade).collect(Collectors.toList());
		
		List<String> nameList1=studentList.stream().flatMap(stud->stud.stream()).map(x->x.sname.toUpperCase().substring(0, 2)).collect(Collectors.toList());
		
		System.out.println(nameList);
		System.out.println(nameList1);
		
		
		
		
	}

}
class Student{
	
	String sname;
	int sid;
	char grade;
	
	Student(String sname,int sid,char grade){
		this.sname=sname;
		this.sid=sid;
		this.grade=grade;
	}
	
}