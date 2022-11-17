package javapackage;

public class Multithreadingexample extends Thread {
	
	//This is one thread 
	public void run()
	{
		//this code for find average of 50 numbers.
		int n=50;
		int sum=0;
		
		for(int i=1;i<=50;i++)  //using for loop find the sum of 50 numbers
		{
			sum+=i;
		}
		
		int average=sum/n;     //This is formula to find average of 50 numbers 
		
		System.out.println("Average of 50 numbers:"+average);  
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multithreadingexample obj=new Multithreadingexample(); //create object of Multithreadingexample class
		
		obj.start(); //call method of Thread class
		
		
		//This is second thread
		
		//This code for find square of given array elements
		int[] array1= {10,15,20,25,30};
		int square=0;
		for(int i=0;i<array1.length;i++)  
		{
			square=(int)Math.pow(array1[i], 2);    //formula to find square of array elements 
			
			System.out.println(array1[i]+" "+square);
		}
		
		

	}

}
