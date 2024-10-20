package jarvis.javaconcepts;

public class Key {
	
	//this - variable , methods , Constructor
	
	  //Same class reference
	
	//super - parent class reference
	
	int a=10;//class variable
	
	public void welcome() {
		
		int x=this.a;//local variable
		
		System.out.println(x);
	}
	
	public Key() {
		
		int b = a;
		
		System.out.println("Jarvis");
	}
	
	public static void main(String[] args) {
		
		Key k = new Key();
		
		k.welcome();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
