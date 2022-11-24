package Labassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Here define Student class
class Student
{
	public Student(int id, String name, double mathmarks) //constructor of Student class withparameter
	{
		super();
		this.id = id;
		this.name = name;
		this.mathmarks = mathmarks;
	}
	
	//here write getter and setter method of all private variable of Student class
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getMathmarks() {
		return mathmarks;
	}
	public void setMathmarks(double mathmarks) {
		this.mathmarks = mathmarks;
	}
	//here declare private variable of Student class
	private int id;
	private String name;
	private double mathmarks;
}

public class Streamexample1 {
	//Main() method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> sdata=new ArrayList<>(); //create ArrayList
		
		//Adding Students
		sdata.add(new Student(101,"Aarti",80));
		sdata.add(new Student(102,"Shivratna",50));
		sdata.add(new Student(103,"Pranita",60));
		sdata.add(new Student(104,"Mahesh",75));
		sdata.add(new Student(105,"Dhanu",70));
		sdata.add(new Student(106,"Pranu",45));
		
		System.out.println("Student marks before filtering:");
		
		//print all Marks of Student.
		sdata.forEach(m->System.out.println(m.getMathmarks()));
		
		//Filter Marks between 60 to 80 using Stream API
		List<Student> sdata1=sdata.stream().filter(m-> m.getMathmarks()>=60 && m.getMathmarks()<=80).collect(Collectors.toList());
		System.out.println("Student marks between 60 to 80:");
		
		//Print marks between 60 to 80 
		sdata1.forEach(s->System.out.println(s.getMathmarks()));
}

}

/*Output:
	Student marks before filtering:
		80.0
		50.0
		60.0
		75.0
		70.0
		45.0
		Student marks between 60 to 80:
		80.0
		60.0
		75.0
		70.0
		*/
