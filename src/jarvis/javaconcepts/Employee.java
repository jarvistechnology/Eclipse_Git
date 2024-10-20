package jarvis.javaconcepts;

public class Employee {
	
	//Overload
	
	//Override
	
	//static Constructor
	
	//Object - instance of the class
	
	//static method can be overload / override
	
	
	public Employee() {//Non -Parameterized Constructor
		
		System.out.println("Employee Details:");
	}
	
	public Employee(String name) {//Parameterized Constructor
		
		System.out.println("Employee Name: "+name);
	}
	
	
	public static void add() {//non parameterized method
		
		System.out.println(2+4);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.add();
		
		Employee e1 = new Employee("Jarvis");
		e1.add();
		
		
		
	}
	

}
