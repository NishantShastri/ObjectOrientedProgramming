package methodStatic;

public class MainClassEmployee {
	
	public static void main(String[] args) {
		
		Employee e = new Employee ();
	
		e.empId = 001;
		e.name = "Alex";
		e.city = "Mumbai";
	
		e.display();
		
		System.out.println("------------------------------------------------------------");
		
		e.empId = 002;
		e.name = "Kate";
		e.city = "Bangalore";
		
		e.display();
		
		System.out.println("------------------------------------------------------------");
		
		e.empId = 003;
		e.name = "Steve";
		e.city = "Pune";
		
		e.display();		
	
	}
	
}
