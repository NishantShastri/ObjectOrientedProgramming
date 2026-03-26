package methodDynamic;

public class MainClassCalculator {
	
	public static void main(String[] args) {
			
	Calculator c = new Calculator ();
	
	System.out.println("Addition is = " + c.myAdd(23,46));
	System.out.println("Subtraction is = " + c.mySub(23,46));
	System.out.println("Multiplication is = " + c.myMul(23,46));
	System.out.println("Division is = " + c.myDiv(10,5));
	
	}
}
	
