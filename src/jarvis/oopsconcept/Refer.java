package jarvis.oopsconcept;

public class Refer {
	
	
	//this - same class refer
	
	//super - parent class refer
	
	//Methods , Variables , Constructor
	
	int a=10;
	
	public void add() {
		
		System.out.println(10+40);
	}
	
	
	public void result() {
		
//		Refer x = new Refer();
//		
//		x.add();
		
		//this.add();
		
		int x = this.a;
		
		
	}
	
	public static void main(String[] args) {
		
		Refer r = new Refer();
		
		r.result();
		
	}

}
