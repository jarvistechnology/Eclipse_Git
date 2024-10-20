package jarvis.oopsconcept;

public class Emp_Details {
	
	
	public void employee() {
		
		System.out.println("Employee Details");
	}
	
	public void employee(String ename) {
		
		System.out.println("Employee Name: "+ename);
		
	}
	
	public void employee(int age) {
		
		System.out.println("Employee Age: "+age);
	}
	
	public void employee(double salary) {
		
		System.out.println("Employee Salary: "+salary);
	}
	
	public void employee(int emi,int rent) {
		
		System.out.println("Employee Rent: "+rent);
		System.out.println("Employee EMI: "+emi);
	}
	
	public void employee(String fname,double pf) {
		System.out.println("Employee Father Name: "+fname);
		System.out.println("Employee PF: "+pf);
	}
	
	public void employee(long eid) {
		
		System.out.println("Employee ID: "+eid);
	}
	
	
	
	public static void main(String[] args) {
		
		Emp_Details sec = new Emp_Details();
		sec.employee();
		sec.employee("Prabu");
		sec.employee(3685696l);
		
		
		Emp_Details acc = new Emp_Details();
		acc.employee();
		acc.employee("Prabu");
		acc.employee(638969l);
		acc.employee("Meganathan", 368650);
		
	
		
	}

}
