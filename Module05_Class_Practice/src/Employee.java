
public class Employee {
	
	int empno;
	String name;
	void display() {
		System.out.println("Emp No = " + empno);
		System.out.println("Name = " + name);
	} // end of display
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.empno = 111;
		e1.name = "Tom";
		e1.display();
	}

}
