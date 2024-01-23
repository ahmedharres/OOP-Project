package OOP;

public class Instructor extends Stuff {
	
	String department;
	int hours;

	 
	
	public Instructor( String fullName,int age ,String nationalNumber,String address,
			String loginSecurityNumber,int workDays,float salary,String department,int hours )
	{
		
		super(fullName, age, nationalNumber, address,loginSecurityNumber,workDays,salary);
		this.department = department;
		this.hours = hours;
	}
	
	public void setDepartment(String department) 
	{
		this.department = department;
		
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getHours() {
		return hours;
	}
	
	@Override
    public float getTotalSalary() {
		return getWorkDays()*130;
	}
    
	
	@Override
	public String toString() {
	    return "Instructor: " + getFullName() + "\n" +
	           "Age: " + getAge() + "\n" +
	           "National Number: " + getNationalNumber() + "\n" +
	           "Address: " + getAddress() + "\n" +
	           "Login Security Number: " + getLoginSecurityNumber() + "\n" +
	           "Work Days: " + getWorkDays() + "\n" +
	           "Salary: " + getSalary() + "\n" +
	           "Department: " + getDepartment() + "\n" +
	           "Hours: " + getHours() + "\n" +
	           "Total salary :" + getTotalSalary() +"\n";
	}
	 }



