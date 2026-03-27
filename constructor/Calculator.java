package constructor;

/*	Use constructor → to initialize data
	Use methods → to perform logic
	
 * 	| Feature     | Method (Employee code) | Constructor (Student code)   |
	| ----------- | ---------------------- | ---------------------------- |
	| Name        | Any name (`display`)   | Must match class (`Student`) |
	| Return type | Required (`void`)      | ❌ No return type             |
	| Call        | Manual                 | Automatic                    |
	| Purpose     | Perform action         | Initialize object            |
	| When runs   | When called            | When object created          |

 *  A constructor is used to create and initialize an object unlike method which stores values and logic
 */

public class Calculator {

	public Calculator(int a, int b) {

    System.out.println("Addition = " + (a + b));
    System.out.println("Subtraction = " + (a - b));
    System.out.println("Multiplication = " + (a * b));
    System.out.println("Division = " + (a / b));
    
	}
}


