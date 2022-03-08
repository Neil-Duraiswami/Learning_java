class A
{
	A(){System.out.println("This is A");}
	}
class B extends A
{
	B(){System.out.println("This is B");}
	
	}
class C extends B
{
	C(){System.out.println("This is C");}
	}
public class MultiLvlinheritance {

	public static void main(String[] args) {
		

		
		C c1=new C();
		//above statement is same as below
		//A c2=new C();
		//B c3=new C();
	}

}
