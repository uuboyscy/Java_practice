
public class AegsLab {
	
	static int factorial(int x) { // method factorial
		int result = 1;
		for(int i = x ; i > 0 ; i--) {
			result *= i;
		}
		return result;
	} // factorial
	
	public static void main(String[] args) {
		
		int x = Integer.parseInt(args[0]);
		System.out.println(x + "! equals " + factorial(x));
		
		
	} // main
	

}
