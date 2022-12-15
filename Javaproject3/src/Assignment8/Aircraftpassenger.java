package Assignment8;

import java.util.Scanner;

public class Aircraftpassenger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of row");
		
		int r=sc.nextInt();  //give number of row from user
		int sum=0;           
		boolean flage=true;
		
		//check if number of row is negative value
		if(r<0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			//Enter people per row using forloop
			for(int i=0;i<r;i++)
			{
				int peopleperrow=sc.nextInt();
				
				//check if people per row is negative value
				if( peopleperrow<0)
				{
					System.out.println("Invalid input");
					
					flage=false;
					break;
				}
				else
				{
					//sum of peopleperrow
					sum+= peopleperrow;
					
					//print number of people per row
					System.out.println( peopleperrow);
				}
			}
			
			//if flage is true then print sum
			if(flage==true)
				System.out.println("sum:"+sum);
		
		
		}*/
		
		String str1 , str2 , str3;

		str3 = new String("jim");

		str1 = new String("jack");

		str2 = str1 ;

		str1 = new String("jill");

		str3 = str2;

		System.out.println(str3);
	}

}
/*output:
 Enter number of row
	5
12 28 30 20 45

12
28
30
20
45
sum:135

Enter number of row
-5
Invalid input

Enter number of row
5
12 28 -30 20 45
12
28
Invalid input

 */
