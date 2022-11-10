package javapackage;

public class Stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare string
		String str="HeLlo";
		
		//change the case of string
		     str=str.substring(0,1).toLowerCase()
				+str.substring(1,2).toUpperCase()
				+str.substring(2,3).toLowerCase()
				+str.substring(3,4).toUpperCase()
				+str.substring(4,5).toUpperCase();
		     
		     //print string after changing case
		System.out.println(str);
	}

}
