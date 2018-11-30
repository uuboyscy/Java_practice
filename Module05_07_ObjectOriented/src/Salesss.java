public class Salesss extends Saless{
	Salesss(int empno, String name, double salary, double commission){
		super(empno, name, salary, commission);
	}
	public double paySalary() {
		return super.paySalary()+100000000;
	}
	
}