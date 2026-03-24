package methodStatic;

public class MainClassCalculator {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
	// For Addition :- 
		
		int add = c.myAddition();
		System.out.println(add);
	
	// Or indirectly we can write it as :-
		
		System.out.println("Addition  = " + c.myAddition());
		
	// For Subtraction :-
		
		int sub = c.mySub();
		System.out.println(sub);
		
	// Or indirectly we can write it as :-
		
		System.out.println("Subtraction  = " + c.mySub());
		
	// For Multiplication :-
		
		int mul = c.myMul();
		System.out.println(mul);
		
	// Or indirectly we can write it as :-	
		
		System.out.println("Multiplication = " + c.myMul());
		
	// For Division :-
		
		int div = c.myDiv();
		System.out.println(div);
		
	// Or indirectly we can write it as :-	
		
		System.out.println("Division = " + c.myDiv());
				
	}
	
}
