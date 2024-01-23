package OOP;

public abstract class  Person {
	private String fullName;
	private int age;
	private String nationalNumber;
	private String address;
	
	public Person (String fullName,
	int age,
	String nationalNumber,
	String address) {
		this.fullName = fullName;
		this.age = age;
		this.nationalNumber = nationalNumber;
		this.address = address;
		
	}
	public void setFullName(String fullName) 
	{
		this.fullName = fullName;
	}
	public void setAge(int age) 
	{ 
		if(age<18 && age>60)
			System.out.println("The age must be abov 16 and under 60");
		this.age = age;
	}
	public void setNationalNumber(String nationalNumber) 
	{
		this.nationalNumber = nationalNumber;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public String getFullName() {
		return fullName;
	}
	public int getAge() {
		return age;
	}
	
	public String getNationalNumber() {
		return nationalNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Instructor: " + getFullName() + "\n" +
		           "Age: " + getAge() + "\n" +
		           "National Number: " + getNationalNumber() + "\n" +
		           "Address: " + getAddress() + "\n";
	}
	
	
	}