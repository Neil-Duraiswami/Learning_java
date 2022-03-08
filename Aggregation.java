//Student class has a School class relation 
class School
{
	String name;
	String Location;
	School(){}
	
	School(String name,String Location)  //para cons
	{
		this.name=name;
		this.Location=Location;
		
	}
     //getters  setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}
	public void print()
	{
	System.out.println("School info:");
	System.out.println("name:" + name);
	System.out.println("loction:" + Location);
	
	}
	}

//CLASS student
class Student
{
	int std,roll;
	String name;
	Student(){}
	
	School school=new School();    ;                   //Aggregation using  class_name 
	
	
    //getter and setters
	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public void print()
	{
	System.out.println("Student Info:");
	
	System.out.println("std:" + std);
	System.out.println("roll:" + roll);
	System.out.println("name:" + name);
	school.print();
	}
	
}
public class Aggregation {

	public static void main(String[] args) {
		
		
		School s=new School("SNBP","Pimpri");
		
        Student stu1=new Student();
        stu1.setStd(11);
        stu1.setRoll(1);
        stu1.setName("Neil");
        stu1.setSchool(s);            //object passed of the base class 
        stu1.print();
        System.out.println(stu1.getSchool().getName());      
                        //obj.func.func also known as deligate
        
        
	}


}
