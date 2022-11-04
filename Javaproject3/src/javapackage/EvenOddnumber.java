package javapackage;

import java.util.ArrayList;

public class EvenOddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>number=new ArrayList<Integer>(); //Initialize ArrayList
		number.add(88);     //here add number on ArrayList
		number.add(57);
		number.add(34);
		number.add(11);
		number .add(48);
		number.forEach((m)->    //Using forEach loop define number is even or odd
		{
			if(m%2==0)  		//logic to check number is even or odd
			{
				System.out.println("Even number:"+m);  //if condition is true then number is even
			}
			else
			{
				System.out.println("odd number:"+m); ///else number is odd
			}
		});

	}

}
