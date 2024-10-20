package jarvis.oopsconcept;

public class Student extends A {
	
	int x=10;
	
	public void student_batch() {
		
		//this();
		
		System.out.println("Batch One");
	}
	
	
	public Student() {//6
		
		int y = this.x;
		
		System.out.println("Student Details");//7
		
		this.student_batch();
	}
	
	
	public Student(String name) {//2
		
		this(10);//3
		
		System.out.println("Student Name: "+name);//9
		
		this.student_batch();
	}
	
	
	public Student(int id) {//4
		
		//this();//5
		
		super();
		
		super.abc();
		
		int c = super.bb;
		
		System.out.println(c);
		
		System.out.println("Student ID: "+id);//8
		
		this.student_batch();
	}
	
	
	public static void main(String[] args) {
		
		
		Student s = new Student("Prabu");//1
		
		
		
	}

}
