package encapsulation;

public class MainClassEmployee {
	
	public static void main(String[] args) {
		
		Employee e = new Employee ();
		
		e.setEmpId(001);
		e.setName("Nishant");
		e.setCity("Pune");
		e.setSalary(32000);
		e.setExp(1);
		
		System.out.println(e.getEmpId());
		System.out.println(e.getName());
		System.out.println(e.getCity());
		System.out.println(e.getSalary());
		System.out.println(e.getExp());
		System.out.println("----------------------------------------------------------------------");
		
		Employee e1 = new Employee();
		
		e1.setEmpId(002);
		e1.setName("Mark");
		e1.setCity("Mumbai");
		e1.setSalary(410000);
		e1.setExp(4);

		System.out.println(e1.getEmpId());
		System.out.println(e1.getName());
		System.out.println(e1.getCity());
		System.out.println(e1.getSalary());
		System.out.println(e1.getExp());
		
		

	
	}

}
