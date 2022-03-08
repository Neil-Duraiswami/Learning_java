import java.util.*;
class calculate
{
calculate(){}
private double a,b,c;
Scanner in =new Scanner(System.in);

void inPut()
{
	System.out.println("Enter 1st number");	
	a=in.nextDouble();
	System.out.println("Enter 2st number");
	b=in.nextDouble();
}
double add()             //Add member method
{
  c=a+b;
return c;
}


double sub()             //Sub member method
{
	
	c=a-b;
return c;
}


      
double mul()             //Mul member method
{
	c=a*b;
return c;
}

double div()             //Div member method
{
	c=a/b;
return c;
}




}



public class Calculator {

	public static void main(String[] args) 
	{
	Scanner in =new Scanner(System.in);
	calculate obj=new calculate();
	int i,dis;
	do {
	obj.inPut();
	
	System.out.println("Enter the number specified for operations Specifically:\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION");
	i=in.nextInt();
	switch(i)
	{
	case 1 :System.out.println("ANSWER:" + obj.add()); break;
	case 2 :System.out.println("ANSWER:" + obj.sub()); break;
	case 3 :System.out.println("ANSWER:" + obj.mul()); break;
	case 4 :System.out.println("ANSWER:" + obj.div()); break;
	default:System.out.println("Enter a valid number");
	}
	
	System.out.println("Press 1 to execute again or 0 to END");
	dis=in.nextInt();
	}while(dis==1);
	System.out.println("--------Program Ended--------");
}
}
