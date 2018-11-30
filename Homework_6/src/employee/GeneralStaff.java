package employee;

public class GeneralStaff extends FullTimeEmployee {

	public GeneralStaff(String name, String gender, String onWorkDate) {
		super(name, gender, onWorkDate);
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Total salary :\t" + salaryPay());
	}
	
}
