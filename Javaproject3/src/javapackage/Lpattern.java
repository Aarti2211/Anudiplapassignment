package javapackage;

public class Lpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) //loop for row
		{
			for(int col=1;col<=5;col++)//loop for column
			{
				if(col==1 || row==5)	//logic for print star in L shape
				{
					System.out.print("*");
				}
				
			}
			System.out.println();  //new line
		}

	}

}
