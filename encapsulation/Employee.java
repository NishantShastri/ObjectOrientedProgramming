package encapsulation;

/* Encapsulation is an main pilers of OOP 
   Encapsulation is a process of binding data (variables) and methods (functions) into a single unit (class) and controlling access to the data using access modifiers(private).
   
    Capsulation = private variables + public getters & setters

	private → restricts direct access
	getter() → only returns value
	setter() → sets value with validation (business logic)
 */

public class Employee {
	
	private int empId;
	private String name;
	private String city;
	private double salary;
	private int exp;
	
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;

	}
}
