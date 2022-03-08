import java.util.*;

class Circle
{
	static double pi=3.14;
	
	Circle(){};
	static double Area(double r)
	{
		return pi*r*r;
	}
	}


public class static_Circle {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		double rad;
		System.out.println("Enter radius of circle:");
		rad=in.nextDouble();
		System.out.println(Circle.Area(rad));                                //classname.static function 
		

	}

}
