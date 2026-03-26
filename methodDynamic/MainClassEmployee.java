package methodDynamic;

public class MainClassEmployee {
	
	public static void main(String[] args) {
		
		Employee a = new Employee ();
		
		String fullname = a.m1("Nishant", "Shastri");
		System.out.println(fullname);
		
		// Or we can write it as 
		
		System.out.println("Name is " + a.m1("Nishant", "Shastri"));
		
		System.out.println("-----------------------------");
		
	    String ageSalary = a.m2(21, 30000);
	    System.out.println(ageSalary);
	    
	    // Or we can write it as 
	    
	    System.out.println("Age and Salary are " + a.m2(21, 30000));
	
	}

}
