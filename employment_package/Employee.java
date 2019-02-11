package employment_package;

public class Employee {
	private int emID;
	private String name;
	private String gender;
	private int age;
	
	public Employee (int emID, String name, String gender, int age) {
		this.emID = emID;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender(){
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getID(){
		return emID;
	}
	
	public void setID(int emID) {
		this.emID = emID;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public LinkedListOfEmployees displayInfo(){
		System.out.println("Employee Id: " + emID);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Gender: " + gender);
		System.out.println("Employee is to live to be the age " + (age + 3) + " before being fired \n and replaced with new blood");
		return null;
	}
}
