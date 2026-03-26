package methodDynamic;

public class EvenOdd {
	
	public int checkEvenOdd (int a) {
		
		if (a % 2 == 0) {
			System.out.println(a + " This is an Even number ");	
		} else {
			System.out.println(a + " This is an Odd number ");
		}
		
		return a;
	}

}
