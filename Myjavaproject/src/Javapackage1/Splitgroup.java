package Javapackage1;

import java.util.Scanner;

public class Splitgroup {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollnumber");
		int n=sc.nextInt();
		if(n%4==1)
		{
			System.out.println("This group is a Sapphire");
		}
		if(n%4==2)
		{
			System.out.println("This group is a Perl");
		}
		if(n%4==3)
		{
			System.out.println("This group is a Ruby");
		}
		if(n%4==0)
		{
			System.out.println("This group is a Emerald");
		}

	}
}
