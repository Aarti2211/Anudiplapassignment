package javapackage;
//Circle is a child class of Shape class
class Circle extends Shape{
	
		public void areaOfcircle() //define areaOfcircle method to calculate area of circle

		{
		int r=5;             // r is a radius of circle
		double pi=3.14;
		double area=pi*r*r;  //this is a formula to find area of circle
		
		System.out.println("Area of Circle:"+area);  //print the area of circle

	}
}
  class Square extends Shape      //Square is a child class of Shape

  {
	
 	public void areaOfsquare()    //define areaOfsquare method to find area of square

	{
		int a=2;       //a is a side
		int area=a*a;   //this is a formula to find area of square
		
		System.out.println("Area of square is:"+area);    	 //print area of square

	}
}

public class Shape {    //Shape class has parent class of Circle and Square
	public void area()
	{
		System.out.println("Shape:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();  //create object of Circle class
		c.areaOfcircle();       //call method of Circle class
		
		Square sq=new Square();  //create object of Square class
		sq.areaOfsquare();       //call method of Square class

	}

}
