
public class Sales extends Permanent{
	
	private double commission;
	Sales(int empno, String name, double salary, double commission){
		super(empno, name, salary);
		this.commission = commission;
	}
	
	
	public double getCommission() {
		return commission;
	}


	public void setCommission(double commission) {
		this.commission = commission;
	}


	public double paySalary() {
		return super.paySalary() + commission;//super.paySalary()�i��getSalary() �A���{�b���g�k����
	}
	
}


