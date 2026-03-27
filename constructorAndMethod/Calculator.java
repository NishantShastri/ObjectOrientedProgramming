package constructorAndMethod;

/* This will contain both methods and constructor
 * While constructor is used to store data and method is used to store the logic printing calculations etc
 * In this code we will use both constructor and method because..
  		Constructor = setup (store data)
 		Method = use data (print, calculate, etc.) 
 */

public class Calculator {
	
	int a, b;
	
	public Calculator (int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}	
	
	public void add () {
		
		int c = a+b;
		System.out.println("Addition = " + c);
	}
	
	public void sub () {
		
		int c = a-b;
		System.out.println("Subtraction = " + c);
	}
	
	public void mul () {
		
		int c = a*b;
		System.out.println("Multiplication = " + c);
	}
	
	public void div () {
		
		int c = a/b;
		System.out.println("Division = " + c);
	}
	


}
