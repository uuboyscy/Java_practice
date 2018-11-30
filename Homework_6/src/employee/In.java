package employee;
import java.util.Scanner;
public final class In {

	 public static int putint(String x) {
		Scanner scanner = new Scanner(System.in);
		int y;
		System.out.println(x);
		y = scanner.nextInt();
		scanner.close();
		return y;
	} // int
	 
	 public static double putdouble(String x) {
			Scanner scanner = new Scanner(System.in);
			double y;
			System.out.println(x);
			y = scanner.nextDouble();
			scanner.close();
			return y;
	 } // double
	 
	 public static int putstring(String x) {
			Scanner scanner = new Scanner(System.in);
			int y;
			System.out.println(x);
			y = scanner.nextInt();
			scanner.close();
			return y;
	} // string
	
	public static void main(String[] args) {
		
		int x = In.putint("enter a number.");
		System.out.println(x);
		
	} // end of main
	
	
} // end of class
