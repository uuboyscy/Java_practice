package employee;

public abstract class TemporaryEmployee extends Employee {
	
	private int workHour;
	private int workHourPay;
	
	public TemporaryEmployee(String name, String gender, String onWorkDate, int workHour, int workHourPay) {
		super(name, gender, onWorkDate);
		this.workHour = workHour;
		this.workHourPay = workHourPay;
	}
	

	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}

	public int getWorkHourPay() {
		return workHourPay;
	}

	public void setWorkHourPay(int workHourPay) {
		this.workHourPay = workHourPay;
	}
	
	

} // end of class
