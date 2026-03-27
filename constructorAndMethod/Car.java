package constructorAndMethod;

public class Car {

	String name, model;
	int year;
	String engine;
	String topspeed;
	
	public Car (String name, String model, int year, String engine, String topspeed) {
		
		this.name = name;
		this.model = model;
		this.year = year;
		this.engine = engine;
		this.topspeed = topspeed;
		
	}
	
	public void display () {
		
		System.out.println("Car name :- " + name);
		System.out.println("Car model :- " + model);
		System.out.println("Manufactured year :- " + year);
		System.out.println("Engine Specs :- " + engine);
		System.out.println("Car Topspeed :- " + topspeed);
		
	}
	
}

