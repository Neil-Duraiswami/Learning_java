class Sup
{ 
	public void print()
	{
		System.out.println("This is original Function");
	}
	}
class Sub extends Sup
{
	@Override            //optional
	public void print()
	{
		
		System.out.println("This is overriden Function");
	}
	}
	
public class methodOverride {

	public static void main(String[] args) {
		
		Sub b1=new Sub();
		b1.print();   //overriden print function
	    

	}

}
