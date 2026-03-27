package constructorAndMethod;

public class MainClassCar {
	
public static void main(String[] args) {
		
		Car a = new Car("Bmw", "M5", 2025, "4500cc V8", "340 Kmph");
		a.display();
		System.out.println("-------------------------------------------");
		
		Car b = new Car("Mercedes", "Maybach", 2025, "4200cc V6", "260 Kmph");
		b.display();
		System.out.println("-------------------------------------------");
		
		Car c = new Car("Audi", "RS6", 2023, "4800cc V8", "370 Kmph");
		c.display();
	
		
	}
}
