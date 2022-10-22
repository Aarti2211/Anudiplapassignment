package javapackage;

public class Ascendingorderstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				  String str="this is easiest example"; //creat a string so sort in ascending order
				  
				  String[] str1=str.split("\\s"); //this will split the string into substring where the substrings are 
				  									//separated by whitespace character.
				  
				  //code to arrange string in ascending order according to their length
				  
				  for(int i=0;i<str1.length;i++) 
				  { 
					  for(int j=i+1;j<str1.length;j++) 
					  { 
					  
					//compare each substring with another substring according
						//to their length
						  if(str1[i].length()>str1[j].length())
						  { 
							  String temp= str1[i]; 
						  	  str1[i]=str1[j]; 
						  	  str1[j]=temp; 
						  } 
					  } 
				   } 
				  //here printing the string in ascending order according to their length
				  for(int i=0;i<str1.length;i++) 
				  { 
					  System.out.print(str1[i]+" ");  
				  } 
				  } 
				 


	}


