package employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		FullTimeEmployee[] g = new GeneralStaff[2];
		FullTimeEmployee[] tm = new TopManager[2];
		FullTimeEmployee[] mm = new MiddleManager[2];
		
		g[0] = new GeneralStaff("Tom", "M", "2017-05-20");
		g[0].setSalary(30000);
		
		g[1] = new GeneralStaff("Mak", "M", "2015-07-30");
		g[1].setSalary(28000);
		g[1].setOvertimeWorkHour(12);
		
		tm[0] = new TopManager("Mary", "F", "2010-01-09");
		tm[0].setSalary(50000);
		
		tm[1] = new TopManager("Jack", "M", "2009-05-21");
		tm[1].setSalary(50000);
		tm[1].setOvertimeWorkHour(16);
		
		mm[0] = new MiddleManager("Allen", "M", "2012-04-20");
		mm[0].setSalary(40000);
		
		mm[1] = new MiddleManager("Maria", "F", "2011-12-21");
		mm[1].setSalary(40000);
		mm[1].setOvertimeWorkHour(11);
		
		for(int i = 0 ; i < g.length ; i++) g[i].printInfo();
		for(int i = 0 ; i < g.length ; i++) tm[i].printInfo();
		for(int i = 0 ; i < g.length ; i++) mm[i].printInfo();
		
		g[0].raiseSalary(g[0]);
		g[0].printInfo();
		
		System.out.println("There are " + Employee.getCount() + " employees");
		
	} // end of main

}
