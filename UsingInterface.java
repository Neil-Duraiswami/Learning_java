import java.util.*;
interface Shape     //interface
{
	public abstract double area();
	}
class Circle1 implements Shape   //class implements interface and its all functions
{
	double rad;
	@Override
	public double area()       //override the interface function
	{
		return 3.142*rad*rad;
	}
	
	public double getRad() {               //member function
		return rad;
	}
	
	public void setRad(double rad) {       //member function
		this.rad = rad;
	}
	
}
class Triangle implements Shape
{
	double b,h;
	@Override
	public double area()       //override the interface function
	{
		return 0.5*b*h;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	
	
	
	}

public class UsingInterface {

	public static void main(String[] args) 
	{
	
	Scanner in=new Scanner(System.in);
	double r;
    System.out.println("Enter radius:");
    r=in.nextDouble();
    Shape s1=new Circle1();
    //s1.setRad(r); cant do this because setRad() belongs to Circle but not Shape
    Circle1 c=new Circle1();
	c.setRad(r);
	s1=(Circle1)c;  //type casting  
	System.out.println(s1.area());
     s1=new Triangle();
     Triangle t=new Triangle();
     
     System.out.println("Enter base and height :");
     double b,h;
     b=in.nextDouble();
     h=in.nextDouble();
     t.setB(b);
     t.setH(h);
     s1=(Triangle)t; //type casting
     System.out.println(s1.area());     
	}

}
