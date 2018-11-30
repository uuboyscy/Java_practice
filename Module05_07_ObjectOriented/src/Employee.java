
public abstract class Employee {

	private int empno;
	private String name;
	private static int empCount;
	
	public Employee(){	
		System.out.println("123");// constructor ,auto-made by system if we don't set the contructor blew
		empCount++;
	} // so we can make it ourselves 
	public Employee(int empno, String name){ // constructor set by myselfe
		this.empno = empno;
		this.name = name;
		empCount++;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmpno() {
		return empno;
	}
	
	public String getName() {
		return name;
	}
	
	public static int getEmpCount() {
		return empCount;
	}
	
/*	void display() {
		System.out.println("Emp No = " + empno);
		System.out.println("Name = " + name);
	}
*/
/*	public double paySalary() { //polymorphism
		return 0;
	}
*/
	public abstract double paySalary();
	
	public void raiseSalary(Employee e) {
		if(e instanceof Permanent) { // Sales is a child class of Permanent
			Permanent p = (Permanent)e;
			//p.salary *= 1.1;
			p.setSalary(p.getSalary()*1.1);//此為物件導向寫法
		}else if(e instanceof Temporary) {
			Temporary t = (Temporary)e;
			//t.hourPay += 20;
			t.setHourPay(t.getHourPay()+20);
		}
	} // raiseSalary
	
	
	public static void main(String[] args) {
		
		//Employee e1 = new Employee();
		//Employee e2;
		//e2 = new Employee(124, "Mary");
		
		//e1.empno = 123;
		//e1.name = "Tom";
		//System.out.println("Emp No = " + e1.empno);
		//System.out.println("Name = " + e1.name);
		//e1.display();
		
		//e2.empno = 124;
		//e2.name = "Mary";
		//e2.display();
		
		Tem t1 = new Tem(125, "Jack", 30);
		//t1.display();
		t1.piriorDay();
		
	} // end of main

}


class Tem extends Employee{
	int pirior;
	Tem(int empno, String name, int pirior){
		super(empno, name);
		this.pirior = pirior;		
	}
	void piriorDay() {
		System.out.println(pirior);
	}
	public double paySalary(){return 1.1;} // *******
}

class TemTem extends Tem{
	TemTem(int empno, String name, int pirior){
		super(empno, name, pirior);		
	}
}

class TemTemTem extends TemTem{
	TemTemTem(int empno, String name, int pirior){
		super(empno, name, pirior);		
	}
}

class TemTemTemt extends TemTemTem{
	TemTemTemt(int empno, String name, int pirior){
		super(empno, name, pirior);		
	}
}

class TemTemTemtt extends TemTemTemt{
	TemTemTemtt(int empno, String name, int pirior){
		super(empno, name, pirior);		
	}
}

class TemTemTemttt extends TemTemTemtt{
	TemTemTemttt(int empno, String name, int pirior){
		super(empno, name, pirior);		
	}
}

class TemTemTemtttt extends TemTemTemttt{
	TemTemTemtttt(int empno, String name, int pirior){
		super(empno, name, pirior);		
	}
}

class TemTemTemttttt extends TemTemTemtttt{
	TemTemTemttttt(int empno, String name, int pirior){
		super(empno, name, pirior);		
	}
}