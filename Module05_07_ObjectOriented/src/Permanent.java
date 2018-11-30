
public class Permanent extends Employee {
	private double salary;
	
	Permanent(){}
	Permanent(int empno, String name, double salary){
		super(empno, name);
		this.salary = salary;		
		} // constructor
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	void salaryValue() {
		System.out.println("Salary = " + salary);
	} // salary
	public double paySalary() {
		return salary;
	}
}
