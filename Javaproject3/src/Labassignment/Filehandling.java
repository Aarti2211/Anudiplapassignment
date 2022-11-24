package Labassignment;
import java.io.*;
import java.util.Scanner;
public class Filehandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("D:\\java\\file1.txt"); //create object of input file
		Scanner sc=new Scanner(fi); //read data from file
		String str="";
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)// for loop
		{
			if(s.charAt(i)!=' ')
			{
				str+=s.charAt(i);
			}
			else
			{
				if(str.length()>5)//condition to check words length is greater than 5
				{
					System.out.println(str+" ");//print words whose length is greater than 5
					str=" ";
				}
			}
		}
		fi.close();//close the input file
	}

}
