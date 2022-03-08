import java.util.*;
class employ
{
int id;                                       //member variables
String name;
int phoneNum;
employ(int id,String name,int phoneNum)      //local variables 
{
	this.id=id;                  //accessing member var and assigning values of local var 
	this.name=name;
	this.phoneNum=phoneNum;
}

}
public class thisKeyword {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int id;                                       //member variables
		String name;
		int phoneNum;
		System.out.println("Enter id, name, mobile no.");
		id=in.nextInt();
		name=in.next();
		phoneNum=in.nextInt();
		employ e =new employ(id,name,phoneNum);

	}

}
