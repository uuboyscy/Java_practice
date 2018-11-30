
public class Factor {
	
	static int factorial(int x) { // method factorial
		int result = 1;
		for(int i = x ; i > 0 ; i--) {
			result *= i;
		}
		return result;
	} // factorial
	
	static void nborder(int x) { // method number order
		for(int i = x ; i > 0 ; i--) {
			System.out.print(i + ((i != 1) ? "*" : ""));
		}
	} // order

	public static void main(String[] args) {
		
		for(int i = 10 ; i > 0 ; i--) {
			System.out.printf("%2d! = ", i);
			nborder(i);
			System.out.println(" = " + factorial(i));
		} // for

	} // end of main

} // end of class
