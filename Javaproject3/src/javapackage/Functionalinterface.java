package javapackage;

import java.util.ArrayList;

//Define Adder interface
interface Adder
{
	public int add(int a,int b); //only Define add() method 
}

public class Functionalinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object of Adder interface
		Adder ad=(x,y)->         //use lambda expression to implement the add() method of Adder interface
		{
			return x+y;          //logic to add two number
		};
		System.out.println(ad.add(5, 10)); //give value to variables and call method of add() 
		
		
		//Declare ArrayList of String type
		ArrayList<String> str=new ArrayList<String>();
		
		str.add("aarti");          //add name into ArrayList
		str.forEach((m)->          //use lambda expression
		{
			System.out.println(m.toUpperCase()); //convert string "aarti" into uppercase latter like "AARTI" 
		});

	}

}
