package Labassignment;

import java.util.ArrayList;
import java.util.List;

class Student1
{

	public Student1(int id, String name, double mathmarks) //constructor of Student1 class with parameter
	{
		super();
		this.id = id;
		this.name = name;
		this.mathmarks = mathmarks;
	}
	
	//here write getter and setter method of all private variable of Student1 class
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
	//here declare private variable of Student1 class
	private int id;
	private String name;
	private double mathmarks;
}

public class Streamexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student1> sdata=new ArrayList<>(); //create ArrayList
		
		//Adding Students
		sdata.add(new Student1(101,"Aarti",80));
		sdata.add(new Student1(102,"Shivratna",50));
		sdata.add(new Student1(103,"Pranita",60));
		sdata.add(new Student1(104,"Mahesh",75));
		sdata.add(new Student1(105,"Dhanu",70));
		sdata.add(new Student1(106,"Pranu",45));
		
		//Print Maximum mark of Student using Stream API
		Student1 maxmark=sdata.stream().max((m1,m2)->m1.getMathmarks()>m2.getMathmarks()?1:-1).get();//use max method to find maximum mark
		System.out.println("Maximum mark:"+maxmark.getMathmarks());

		//Print Minimum mark of Student using Stream API
		Student1 minmark=sdata.stream().min((m1,m2)->m1.getMathmarks()>m2.getMathmarks()?1:-1).get();//use min method to find minimum mark
		System.out.println("Minimum mark:"+minmark.getMathmarks());

	}

}
/*output:
Maximum mark:80.0
Minimum mark:45.0*/

