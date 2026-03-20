package classAndObject;

public class MainClassLaptop {

	public static void main(String[] args) {
		
//		Object Creation / Instance Creation

//		ClassName objectName = new ClassName;

		Laptop hp = new Laptop();
		System.out.println("Brand Name :- " + (hp.brand = "Hp"));
		System.out.println("Total Ram :- " + (hp.ram = 16) + " Gb ");
		System.out.println("GPU integrated :- " + (hp.gpu = "RTX4060"));
		
		System.out.println("------------------------------------------------------------------------------");
		
		Laptop asus = new Laptop();
		System.out.println("Brand Name :- " + (asus.brand = "Asus"));
		System.out.println("Total Ram :- " + (asus.ram = 24) + " Gb ");
		System.out.println("GPU integrated :- " + (asus.gpu = "RTX5050"));
		
		System.out.println("------------------------------------------------------------------------------");
		
		Laptop acer = new Laptop();
		System.out.println("Brand Name :- " + (acer.brand = "Acer"));
		System.out.println("Total Ram :- " + (acer.ram = 32) + " Gb ");
		System.out.println("GPU integrated :- " + (acer.gpu = "RTX5090"));
	}
	
}
