package jarvis.oopsconcept;

public class Employee {
	
	
	//PolyMorphism
	
	  //Method Overloading - Same Class , Method names same , arguments will be different
	  //Method Overriding

	
	public void emp_Details() {
		
		System.out.println("Employee Details");
	}
	
	
	public void emp_Details(String name) {
		
		System.out.println("Name: "+name);
		
		
	}
	
	
	public void emp_Details(int salary) {
		
		System.out.println("Salary: "+salary);
	}
	
	
	public void emp_Details(String person,int age) {
		
		
		System.out.println(person);
		
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		e.emp_Details();
		e.emp_Details("Meena");
		e.emp_Details(50000);
		System.out.println();
		Employee p = new Employee();
		p.emp_Details();
		p.emp_Details("Poorinma");
		
		p.emp_Details("sbfjkahgk", 74);
		
		
		
		
		
		
		//Name
		//ID
		//Company
		//Age
		//Dob
		//Salary
		//PF
		//Bank Account
		//Skills
		//etc...
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
