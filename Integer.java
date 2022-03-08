import java.util.*; 
public class Integer {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);  //System.in is a standard input stream  
		int  i;
        char press;
		do {
		
	   System.out.println("Enter 1st number ");
	   int a = input.nextInt(); // input is an object that is used to store in "a" variable Using next_integerfunc 
	   System.out.println("Enter 2nd number ");
	   int b=input.nextInt();
	   System.out.println("\n Enter 1 to add \n Enter 2 to sub \n Enter 3 to mul \n Enter 4 to div \n ");
	   i=input.nextInt();
	   
	   
	   switch (i)
	   {
	   case 1 : System.out.println(a+b);break;
	   case 2 : System.out.println(a-b);break;
	   case 3 : System.out.println(a*b);break;
	   case 4 : System.out.println(a/b);break;
	   default: System.out.println("Wrong Entery try again!!");
	   }
		
		System.out.println("Do you want to continue...Press 'Y' for YES or 'N' for NO ");
		press=input.next().charAt(0);  //input for char is .next().charAT(0)
		} while( press =='Y');
	}

}
