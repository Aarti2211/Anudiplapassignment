package PerfectSquarenumber;

import java.util.Scanner;

public class CheckPerfectSquareArray {
	
	
	public static void main(String args[])
	{
		
		//Given input
		int[] arr={16,144,169,224};
		
		//condition to check array is perfect square or not
		if(checkperfectSquare(arr))
		{
			System.out.println("The array is perfect square aaray");
		}
		else
			System.out.println("The array is not perfect square aaray");
				
		}
	
		//method to check perfect square array
		static boolean checkperfectSquare(int[] arr)
		{
			int pp=0,ps=0;
			
			//here logic to check perfect square elements
			for(int i=0;i<arr.length;i++)
			{
				ps=(int)Math.sqrt(arr[i]);
				
				pp=ps*ps;
				
			
				if(pp!=arr[i])
				{
					return false;
				}
			}
					return true;
		
			}
		}
//Output:
//The array is not perfect square aaray

