package javapackage;

public class Matrixexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] original= {{1,2},{4,5},{8,9}}; //create matrix
		
		//creating another matrix to store transpose matrix
		int[][] transpose=new int[2][3]; //three columns and three rows
		
		 //code for transpose matrix
		for(int i=0;i<3;i++)   
		{
			for(int j=0;j<2;j++)
			{
				transpose[j][i]=original[i][j];  //transpose rows into columns and columns into rows.
			}
		}
		
		System.out.println("Printing matrix after transpose");
		
		for(int i=0;i<2;i++)     
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(transpose[i][j]+" ");   //printing transpose matrix
			}
			System.out.println();  //new line
		}
		
		//Multiplication of all members in transpose matrix
		
		int mul=1;  //ctreate variable of mul to store multiplication of member in transpose matrix
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				mul*=transpose[i][j];  //multiply member in transpose matrix
			}
		}
			System.out.println("Multiplication of all members in transpose matrix:"+mul);
		
	}

}
