package employee;

public abstract class Employee {

	private String name;
	private String gender;
	private String onWorkDate;
	private String tel;
	private String address;
	private static int count = 0;
		
	public Employee(String name, String gender, String onWorkDate) {
		this.name = name;
		this.gender = gender;
		this.onWorkDate = onWorkDate;
		count++;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOnWorkDate() {
		return onWorkDate;
	}

	public void setOnWorkDate(String onWorkDate) {
		this.onWorkDate = onWorkDate;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void printInfo() {
		System.out.println("------------------------------");
		System.out.println("Name :\t\t" + name);
		System.out.println("Gender :\t" + gender);
		System.out.println("On work date :\t" + onWorkDate);
	} // method printInfo
	
	void raiseSalary(Employee e) {
		if(e instanceof FullTimeEmployee) {
			FullTimeEmployee p = (FullTimeEmployee)e;
			p.setSalary((int)(p.getSalary()*1.1)); 
		}else if(e instanceof TemporaryEmployee) {
			TemporaryEmployee p = (TemporaryEmployee)e;
			p.setWorkHourPay(p.getWorkHourPay()+20);
		}
	} // method raiseSalary
	
	public static int getCount() {
		return count;
	}

} // end of class Employee
