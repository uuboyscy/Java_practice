package employee;

public class MiddleManager extends FullTimeEmployee {

	private static int lunchAllowance = 1800;
	private static int occuAllowance = 3000;
	
	public MiddleManager(String name, String gender, String onWorkDate) {
		super(name, gender, onWorkDate);
	}
	
	
	public static int getLunchAllowance() {
		return lunchAllowance;
	}
	
	public static int getOccuAllowance() {
		return occuAllowance;
	}
	
	
	public double salaryPay() {
		return super.salaryPay() + lunchAllowance + occuAllowance;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Total salary :\t" + salaryPay());
	}
	
} // end of class
