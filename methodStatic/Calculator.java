package methodStatic;

public class Calculator {

	/* In static method the input is already put in this backend and the result will be out in frontend
	 * Here the customer/user cant interact with the machine or type any input as they can only see the results
	 * This can only be changed by the developer
	 */

	public int myAddition() {

		int a = 6;
		int b = 7;
		int c = a + b;

		return c;

	}
	
	public int mySub() {

		int a = 6;
		int b = 7;
		int c = a - b;

		return c;

	}
	
	public int myMul() {

		int a = 6;
		int b = 7;
		int c = a * b;

		return c;

	}
	
	public int myDiv() {

		int a = 6;
		int b = 7;
		int c = a / b;

		return c;

	}

}

