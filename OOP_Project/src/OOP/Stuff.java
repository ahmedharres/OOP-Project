package OOP;

public abstract class Stuff extends Person {
	
	String loginSecurityNumber;
	int workDays;
	float salary;
	
	public Stuff(String fullName,int age ,String nationalNumber,String address,
			String loginSecurityNumber,int workDays,float salary)
	{
		super(fullName, age, nationalNumber, address);

		this.loginSecurityNumber = loginSecurityNumber;
		this.workDays = workDays;
		this.salary = salary;
	}
	
	public void setLoginSecurityNumber(String loginSecurityNumber) 
	{
		this.loginSecurityNumber = loginSecurityNumber;

	}
	
	public void setWorkDays(int workDays) 
	{
		this.workDays = workDays;

	}
	public void setSalary(float salary) 
	{
		this.salary = salary;
	}
	
	public String getLoginSecurityNumber() 
	{
		return loginSecurityNumber;
	}
	
	public int getWorkDays() 
	{
		return workDays;
		
	}
	
	public float getSalary() 
	{
		return salary;
	}
	
	public float getTotalSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Instructor: " + getFullName() + "\n" +
		           "Age: " + getAge() + "\n" +
		           "National Number: " + getNationalNumber() + "\n" +
		           "Address: " + getAddress() + "\n" +
		           "Login Security Number: " + getLoginSecurityNumber() + "\n" +
		           "Work Days: " + getWorkDays() + "\n" +
		           "Salary: " + getSalary() + "\n" ;
	}

	
}
