package Assignment8;
//Define class 
public class Circle
{
	double Area;
	double pi=3.14;
	int r;
	
	//call Parameterized Constructor of Circle class
	Circle(int radius)
	{
		this.r=radius;
	}
	
	//call method to find area of first circle
	public double areaOffirstCircle()
	{
		return Area=pi*r;
		
	}
	
	//call method to find area of second circle
	public double areaOfsecondCircle()
	{
		return Area=pi*r;
		
	}

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object of Circle class constructor
		Circle obj1=new Circle(4);   
		Circle obj2=new Circle(20);
		
		//print area of first circle and second circle
		System.out.println("Area of first circle:"+obj1.areaOffirstCircle());
		System.out.println("Area of first circle:"+obj2.areaOfsecondCircle());
	}

}

/*output:
 * Area of first circle:12.56
   Area of first circle:62.800000000000004 */
