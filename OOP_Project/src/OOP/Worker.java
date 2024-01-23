package OOP;

public class Worker extends Stuff {
	
	String department;
	
	public Worker(String fullName, int age, String nationalNumber, String address,
            String loginSecurityNumber, int workDays, float salary, String department) {
     super(fullName, age, nationalNumber, address, loginSecurityNumber, workDays, salary);
     this.department = department;
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
    return "Worker: " + getFullName() + "\n" +
           "Age: " + getAge() + "\n" +
           "National Number: " + getNationalNumber() + "\n" +
           "Address: " + getAddress() + "\n" +
           "Login Security Number: " + getLoginSecurityNumber() + "\n" +
           "Work Days: " + getWorkDays() + "\n" +
           "Salary: " + getSalary() + "\n" +
           "Department: " + department +
           "Total salary :" + getTotalSalary() +"\n";
}
}
