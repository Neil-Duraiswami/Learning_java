class Vehicle   //parent class
{
	int vehicleRegNo;
	long  insuranceNo;
	String ownerName;
	String numberPlate;
	
	Vehicle(){}

	
	public int getVehicleRegNo() {
		return vehicleRegNo;
	}

	
	public void setVehicleRegNo(int vehicleRegNo) {
		this.vehicleRegNo = vehicleRegNo;
	}

	
	public long getInsuranceNo() {
		return insuranceNo;
	}

	
	public void setInsuranceNo(long insuranceNo) {
		this.insuranceNo = insuranceNo;
	}

	
	public String getOwnerName() {
		return ownerName;
	}

	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	
	public String getNumberPlate() {
		return numberPlate;
	}

	
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	
	public void print()
	{
		System.out.println(getVehicleRegNo());
		System.out.println(getInsuranceNo());
		System.out.println(getOwnerName());
		System.out.println(getNumberPlate());
	}
	}


class Car extends Vehicle   //child class
{
	String carName;

	Car(){}
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void print()
	{
		super.print();
		System.out.println(getCarName());
	}
	}



public class Inheritance {

	public static void main(String[] args) 
	{
	Car c=new Car();
	c.setCarName("Honda");
	c.setVehicleRegNo(15248);
    c.setInsuranceNo(734872925);
    c.setNumberPlate("MH12 AD 5763");
    c.setOwnerName("Om Mishra");
    c.print();
	}

}
