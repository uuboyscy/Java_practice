package employee;

public class TopManager extends FullTimeEmployee {

	private static int lunchAllowance = 1800;
	private static int occuAllowance = 5000;
	private static int trafficAllowance = 2000;
	
	public TopManager(String name, String gender, String onWorkDate) {
		super(name, gender, onWorkDate);
	}
	
	
	public static int getLunchAllowance() {
		return lunchAllowance;
	}
	
	public static int getOccuAllowance() {
		return occuAllowance;
	}
	
	public static int getTrafficAllowance() {
		return trafficAllowance;
	}
	
	
	public double salaryPay() {
		return super.salaryPay() + lunchAllowance + occuAllowance + trafficAllowance;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Total salary :\t" + salaryPay());
	}
	
} //end of class
