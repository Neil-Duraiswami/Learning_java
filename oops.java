import java.util.*;

 class class1     //class
{
private int a;
Scanner in =new Scanner(System.in);

class1(){}    //construct

public void display() 

{
 
	System.out.println("Enter a number: ");
	a=in.nextInt();
	
}


}
 
 
public class oops {

	public static void main(String[] args) {
		
		class1 obj =new class1();
		
		obj.display();

	}

}
