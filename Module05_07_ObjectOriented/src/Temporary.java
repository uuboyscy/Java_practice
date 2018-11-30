
public class Temporary extends Employee{

	private double hourPay;
	private int workHour;
	Temporary(int empno, String name, double hourPay, int workHour){
		super(empno, name);
		this.hourPay = hourPay;
		this.workHour = workHour;
	}
	
public double getHourPay() {
		return hourPay;
	}

	public void setHourPay(double hourPay) {
		this.hourPay = hourPay;
	}

	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}

	/*	void display() {
		super.display();
		System.out.println("Hour pay = " + hourPay);
		System.out.println("Work hour = " + workHour);
	}
*/
	public double paySalary() {
		return hourPay * workHour;
	}
	
}
