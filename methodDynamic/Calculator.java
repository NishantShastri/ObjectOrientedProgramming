package methodDynamic;

public class Calculator {
	
	/* Unlike the static method, the dynamic method is used to take input from the user and execute the code
	 * The developer can put code logic in back end while the user can put input in front end 
	 */
	
	public int myAdd (int a, int b) {
		
		int c = a+b;
		return c;
		
	}
	
	public int mySub (int a, int b) {
		
		int c = a-b;
		return c;		
	}

	public int myMul (int a, int b) {
		
		int c = a*b;	
		return c;
	}
	
	public int myDiv (int a, int b) {
		
		int c = a/b;
		return c;
		
	}

}
