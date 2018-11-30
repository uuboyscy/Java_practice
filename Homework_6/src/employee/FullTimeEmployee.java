package employee;

public abstract class FullTimeEmployee extends Employee {

	private int overtimeWorkHour;
	private int salary;
	
	public FullTimeEmployee(String name, String gender, String onWorkDate) {
		super(name, gender, onWorkDate);
	}
	
	
	public int getOvertimeWorkHour() {
		return overtimeWorkHour;
	}

	public void setOvertimeWorkHour(int overtimeWorkHour) {
		this.overtimeWorkHour = overtimeWorkHour;
	}
	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public double overtimePay() { // compute overtime pay
		double overtimePay = getSalary()*1.5/240 * overtimeWorkHour;
		return overtimePay;
	}
	
	public double salaryPay() { // overtimePay() + salary + allowance
		return overtimePay() + getSalary();
	}
	
/*	void raiseSalary(FullTimeEmployee e) {
		e.setSalary((int)(e.getSalary()*1.1)); 
	}
*/	
} //end of class FullTimeEmployee
