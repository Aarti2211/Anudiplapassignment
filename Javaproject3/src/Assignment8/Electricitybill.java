package Assignment8;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Unit:");
		int unit=sc.nextInt();   //give unit from user
		
		double paybill;
		
		//check electricity bill if unit is upto 100
		if(unit<=100)
		{
			
			//calculate electricity bill
			paybill=unit*1.2;
			System.out.println("Electricity bill upto 100 unit is a:"+paybill);
		}
		
		//check electricity bill if unit is 100 to 300
		else if( unit<=300)
		{
			paybill=100*1.2+(unit-100)*2;
			System.out.println("Electricitybill if unit 100 to 300 :"+paybill);
		}
		
		//print electricity bill if unit is other than above both condition
		else
		{
			paybill=(100*1.2)+(200*2)+(unit-300)*3;
			System.out.println("Electricity bill:"+paybill);
		}

	}

}
/*output:
   Enter Unit:
   100
   Electricity bill upto 100 unit is a:120.0
   
   Enter Unit:
   299
   Electricity bill if unit 100 to 300 :518.0
   
   Enter Unit:
   420
   Electricity bill:880.0

*/
