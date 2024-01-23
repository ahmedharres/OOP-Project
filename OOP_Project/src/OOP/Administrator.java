package OOP;

public class Administrator extends Stuff {
	
	int numberOfOfficers;
	String department;
	
	public Administrator(String fullName,int age ,String nationalNumber,String address,
			String loginSecurityNumber,int workDays,float salary,int numberOfOfficers, String department)
	{
		
		super(fullName, age, nationalNumber, address,loginSecurityNumber,workDays,salary);
		
		this.numberOfOfficers = numberOfOfficers;
		this.department = department;

	}
	 public void setNumberOfOfficers(int numberOfOfficers) {
	        this.numberOfOfficers = numberOfOfficers;
	    }
	    
	    public int getNumberOfOfficers() {
	        return numberOfOfficers;
	    }
	    
	    public void setDepartment(String department) {
	        this.department = department;
	    }
	    
	    public String getDepartment() {
	        return department;
	    }
	    @Override
	    public float getTotalSalary() {
			return getWorkDays()*130;
		}
	    
	    @Override
	    public String toString() {
	        return "Administrator: " + getFullName() + "\n" +
	               "Age: " + getAge() + "\n" +
	               "National Number: " + getNationalNumber() + "\n" +
	               "Address: " + getAddress() + "\n" +
	               "Login Security Number: " + getLoginSecurityNumber() + "\n" +
	               "Work Days: " + getWorkDays() + "\n" +
	               "Salary: " + getSalary() + "\n" +
	               "Number of Officers: " + numberOfOfficers + "\n" +
	               "Department: " + department +
	               "Total salary :" + getTotalSalary() +"\n";

	    }
	}

