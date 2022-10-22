package javapackage;

public class HCFoftwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60; //first number
		
		int b=36; //second number
		
		int hcf=0; //This is hcf initialize to 0.
		
		// code for find hcf of a and b
		
		for(int i=1;i<=a || i<=b;i++) //set loop from 1 to max a and b
		{
			if(a%i==0 && b%i==0) //check if both are divisible by same loop number.
			{
				hcf=i;
			}
		}
		//print HCF of 60 and 36
		System.out.println("Highest common Factor of 60 and 36 is:"+hcf);
	}

}
