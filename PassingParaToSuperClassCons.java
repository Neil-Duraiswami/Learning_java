//Passing Parameters to superclass constructor

class Person
{
	String name;
	
	Person(){}
	Person(String name)
	{
		this.name=name;
	}
	void print()
	{
		System.out.println(name);
		
	}
	}
class Address extends Person
{
	String city;
	Address(){}
	Address(String name,String city)
	{
		super(name);   //super(); calls to super constructor
		this.city=city;
	}
	
	void print()
	{
		super.print();
		System.out.println(city);
		
	}
	}
public class PassingParaToSuperClassCons {

	public static void main(String[] args) {
		
      
		Address n1=new Address("neil","Pune");
		n1.print();

}
}
