package jarvis.oopsconcept;

public class A {
	
	int bb=100;
	public A() {
		
		System.out.println("Welcome");
	}
	
	
	public void abc() {
		
		System.out.println("Jarvis Tech");
	}
	
	public static void main(String[] args) {
		
		State s = new State();
		
		s.a();
		
		State.b();
	
	}

}
