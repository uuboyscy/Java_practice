
public class Employeemain {

	public static void main(String[] args) {
		
/*		Employee e1 = new Employee();
		Employee e2;
		e2 = new Employee(124, "Mary");
		
		e1.setEmpno(123);
		e1.setName("Tom");
		System.out.println(e1.getEmpno());
		System.out.println(e1.getName());
		
		
		//e2.empno = 124;
		//e2.name = "Mary";
		
		
		Permanent p1 = new Permanent(125, "Jack", 45000);
		//p1.display();
		//p1.salaryValue();
		System.out.println("------------------");
		
		Employee e = p1;
		
		//e.salary = 100 ; //wrong
		Permanent p2 = (Permanent)e;
		//p2.display();
		//Temporary t = (Temporary)e; // runtime error
		//t.display();
		//--------------------------------------------
*/		
		// this is not proper , if in the case that 100 people
		Permanent p1 = new Permanent(444, "Stephen", 50000);
		Temporary t = new Temporary(555, "Jean", 150, 80);
		Sales s = new Sales(666, "David", 20000, 23000);
		System.out.println(p1.paySalary());
		System.out.println(t.paySalary());
		System.out.println(s.paySalary());
		
		System.out.println("------------------------");
		
		//this is better //polymorphism ,see Employee
		Employee[] e = new Employee[4];
		e[0] = new Permanent(444, "Stephen", 50000);
		e[1] = new Temporary(555, "Jean", 150, 80);
		e[2] = new Sales(666, "David", 20000, 23000);
		e[3] = new Saless(777, "Davi", 20000, 23001);
		for(int i = 0 ; i < e.length ; i++) {
			System.out.println(e[i].paySalary());
		}
		// must add a method paySalary() in Employee, no matter what it returns
		
		System.out.println("------------------------");
		
		for(int i = 0 ; i < e.length ; i++) e[0].raiseSalary(e[i]);
		for(int i = 0 ; i < e.length ; i++) System.out.println(e[i].paySalary());
		
		System.out.println("There are " + Employee.getEmpCount() + " Employees.");
		
	} // end of main

} // end of class Employeemain
