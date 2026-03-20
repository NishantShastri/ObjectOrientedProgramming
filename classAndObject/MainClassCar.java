package classAndObject;

public class MainClassCar {
	
	public static void main(String[] args) {

//		Object Creation / Instance Creation

//		ClassName objectName = new ClassName;

		Car bmw = new Car();
		System.out.println("BMW car Model year =  " + (bmw.modelYr = 2014));
		System.out.println("BMW car engine cc = " + (bmw.engineCC = 5000));
		System.out.println("BMW car color = " + (bmw.clr = "red"));

		System.out.println("--------------------------------------------------------------------------------");

		Car mercedes = new Car();
		System.out.println("Mercedes car Model year =  " + (mercedes.modelYr = 2015));
		System.out.println("Mercedes car engine cc =  " + (mercedes.engineCC = 4500));
		System.out.println("Mercedes car color =  " + (mercedes.clr = "black"));

		System.out.println("---------------------------------------------------------------------------------");

		Car audi = new Car();
		System.out.println("Audi car Model year =  " + (audi.modelYr = 2023));
		System.out.println("Audi car engine cc =  " + (audi.engineCC = 4000));
		System.out.println("Audi car color =  " + (audi.clr = "white"));

		System.out.println("----------------------------------------------------------------------------------");

		Car virtus = new Car();
		System.out.println("Virtus car Model year =  " + (virtus.modelYr = 2022));
		System.out.println("Virtus car engine cc =  " + (virtus.engineCC = 1500));
		System.out.println("Virtus car color =  " + (virtus.clr = "blue"));

	}
}
