package OOP;

public class Student extends Person {
	private double gpa;
	private String acdimicNumber;
	private String acdimicEmail;
	
	public Student (String fullName,int age ,String nationalNumber,String address,
			double gpa,String acdimicNumber,String acdimicEmail )
	{
		super(fullName, age, nationalNumber, address);
		this.acdimicNumber = acdimicNumber; 
		this.acdimicEmail = acdimicEmail; 
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public void setAcdimicNumber(String acdimicNumber) {
		this.acdimicNumber = acdimicNumber;
	}

	public void setAcdimicEmail(String acdimicEmail) {
		this.acdimicEmail = acdimicEmail;
	}
	
	public double getGpa() {
		return gpa;
	}
	public String getAcdimicNumber() {
		return acdimicNumber;
	}
	public String getAcidimicEmail() {
		return acdimicEmail;
	}
	
	@Override
	public String toString() {
		return "Student: " + getFullName() + "\n" +
		           "Age: " + getAge() + "\n" +
		           "National Number: " + getNationalNumber() + "\n" +
		           "Address: " + getAddress() + "\n" +
		           "gpa :" + getGpa() +"\n"+
		           "Acdimic Number :" + getAcdimicNumber() +"\n" +
		           "Acdimic Email :" + getAcidimicEmail() + "\n";
	
	}
}

