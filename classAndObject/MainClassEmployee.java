package classAndObject;

public class MainClassEmployee {
	
	public static void main(String[] args) {
		
//		Object Creation / Instance Creation

//		ClassName objectName = new ClassName;
		
		Employee Marketing = new Employee();
		System.out.println("Employee ID :-" + (Marketing.id = 01));
		System.out.println("Employee Name :-" + (Marketing.name = "Alex"));
		System.out.println("Employee Salary :-" + (Marketing.salary = 45000));
		
		System.out.println("------------------------------------------------------------------------------");
		
		Employee Logistics = new Employee();
		System.out.println("Employee ID :-" + (Logistics.id = 02));
		System.out.println("Employee Name :-" + (Logistics.name = "Ethan"));
		System.out.println("Employee Salary :-" + (Logistics.salary = 65000));
		
		System.out.println("------------------------------------------------------------------------------");
		
		Employee Software = new Employee();
		System.out.println("Employee ID :-" + (Software.id = 03));
		System.out.println("Employee Name :-" + (Software.name = "Mark"));
		System.out.println("Employee Salary :-" + (Software.salary = 85000));
	}

}
