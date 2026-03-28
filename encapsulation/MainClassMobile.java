package encapsulation;

public class MainClassMobile {
	
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		
		m.setUsername("Nishant");
		m.setPassword("1234567ewc1");
		
		System.out.println("Username is :- " + m.getUsername());
		System.out.println("Password is :- " + m.getPassword());
		System.out.println("---------------------------------------------------------------------");
		
		m.setUsername("Ethan");
		m.setPassword("12qer");
		
		System.out.println("Username is :- " + m.getUsername());
		System.out.println("Password is :- " + m.getPassword());
		System.out.println("---------------------------------------------------------------------");		
		
		m.setUsername("Mark");
		m.setPassword("452q4251ewc1");
		
		System.out.println("Username is :- " + m.getUsername());
		System.out.println("Password is :- " + m.getPassword());
		
	}

}
