package OOP;

public class Technical extends Stuff {
	int floorNumber;
	int labsNumber;
	
	public Technical (String fullName,int age ,String nationalNumber,String address,
			String loginSecurityNumber,int workDays,float salary,int floorNumber,int labsNumber)
	{
		super(fullName, age, nationalNumber, address,loginSecurityNumber,workDays,salary);
		this.floorNumber = floorNumber;
		this.labsNumber = labsNumber;
		
	}
	
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	
	public int getFloorNumber() {
		return floorNumber;
	}
	
	public void setLabsNumber(int labsNumber) {
		this.labsNumber = labsNumber;
	}
	
	public int getLabsNumber() {
		return labsNumber;
	}
	
	@Override
    public float getTotalSalary() {
		return getWorkDays()*130;
	}
    
	
	@Override
	public String toString() {
		return "Technical: " + getFullName() + "\n" +
		           "Age: " + getAge() + "\n" +
		           "National Number: " + getNationalNumber() + "\n" +
		           "Address: " + getAddress() + "\n" +
		           "Login Security Number: " + getLoginSecurityNumber() + "\n" +
		           "Floor Number :" + getFloorNumber() + "\n"+
		           "Labs Number :" + getLabsNumber() + "\n"+
		           "Total salary :" + getTotalSalary() +"\n";

		           }

}
