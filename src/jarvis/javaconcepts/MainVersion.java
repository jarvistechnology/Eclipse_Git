package jarvis.javaconcepts;

public class MainVersion {
	
	//super - parent class reference
	
	int number=100;
	
	public MainVersion(int a) {
		
		System.out.println("Main Source :"+a);
	}
	
	
	public void hello(String word) {
		
		System.out.println(word);
	}
	
	
	public static void main(String[] args) {
		
		MainVersion v = new MainVersion(10);
		v.hello("welcome");
		v.hello("hello");
		
		MainVersion v1 = new MainVersion(25);
		
	}
	

}
