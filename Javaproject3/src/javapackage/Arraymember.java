package javapackage;

import java.util.Scanner;

      // class that uses custom exception Zeromembererror.
class Arraymember {
	
	
	  // method to check the number of elements in array
	public static void checkArraymember(int n)throws Exception
	{
		
		if(n==0)
			
		{
			
			   // throw an object of user defined exception  
			throw new Zeromembererror("No any member in array");
		}
		else
		{
			System.out.println("members are in array:"+n);
		}
	}

	         //main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of array element");
		
		//reading the number of elements from the that we want to enter  
		int num=sc.nextInt();
		
		//creates an array in the memory of length 5 
		int[] array=new int[5];
		
		System.out.println("Enter the array element:");
		for(int i=0;i<num;i++)
		{
			
			//reading array elements from the user   
			array[i]=sc.nextInt();
		}
		
		//calling the method
		checkArraymember (num);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		

	}

	
}
