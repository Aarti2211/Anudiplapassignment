import java.util.Scanner;

public class Prizedistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter angle of triangl");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int sum=x+y+z;
		if(sum==180 && x<90 && y<90 && z<90)
		{
			System.out.println("Student getting 1st prize");
		}
		else if(x==90 || y==90 || z==90)
			{
				System.out.println("Students getting 2nd prize");
			
			}
			
		else 
		{
			System.out.println("Don't give any prize");
		}

	}

}
