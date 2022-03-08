import java.util.Scanner;
//Used paraconst
class swap
{
	swap()
	{}
	double temp;
 swap(double a,double b) //para
	{
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap 1st number" + a);
		System.out.println("After swap 2nd number" + b);
	}
 
	}
public class Swapping {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		double i,j;
		System.out.println("Enter the 1st number to be swapped:");
		i=in.nextDouble();
		System.out.println("Enter the 2nd number to be swapped:");
		j=in.nextDouble();
		swap obj=new swap(i,j);
	}

}
