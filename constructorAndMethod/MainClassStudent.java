package constructorAndMethod;

public class MainClassStudent {
	
	public static void main(String[] args) {
		
		Student a = new Student ("Nishant", "Shastri", 21, 932874032740l, "ns@gmail.com");
		a.display();
		System.out.println("---------------------------------------------------------------------------");
		
		Student b = new Student("Alex", "Heisenberg", 24, 63423489876l, "ah@gmail.com");
		b.display();
		System.out.println("------------------------------------------------------------------------");
		
		Student c = new Student("Mark", "plier", 23, 43454349876l, "mp@gmail.com");
		c.display();
		System.out.println("------------------------------------------------------------------------");
		
		Student d = new Student("Steve", "Adams", 26, 834252789876l, "sa@gmail.com");
		d.display();
		
			
	}

}
