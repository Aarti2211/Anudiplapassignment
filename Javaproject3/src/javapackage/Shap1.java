package javapackage;
class Circle1 extends Shap1  //circle class has child of Shap1 class
{
	public void area()    //define area method to find area of circle
	{
		int r=5;          //radius of circle
		double pi=3.14d;
				double Area=pi*r*r;   //formula to find area of circle
				System.out.println("Area of circle:"+Area);   //print area of circle
	}
}
class Square1 extends Shap1    //Square1 has child of Shap1 class
{
	public void area()        //define area method to find area of Square
	{
		int a=6;			// a is a side
		int Area=a*a;		//formula to find area of Square
		System.out.println("Area of Square:"+Area); //print area of square
	}
}

public class Shap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c=new Circle1();   //create object of Circle1 class
		c.area();					//call area method of Circle1 class by it's object
		
		Square1 s=new Square1();    //create object of square1 class
	 	s.area();					//call area method of Square1 class by it's object
		

	}

}
