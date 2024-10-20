package jarvis.javaconcepts;

public class Version1 extends MainVersion{
	
	int x;
	///this - current class reference / same class reference
	
	
	//variable , methods , constructor
	
	public void hello() {
		System.out.println("Hi");
	}
	
	
	public void a() {//user defined method
		
		System.out.println("Hello");
	}
	
	public void b() {
		
//		Version1 x = new Version1();
//		x.a();
		
		int y = super.number;
		
		this.a();
		
		super.hello("haha");
		
		System.out.println(x);
		
	}
	
	
	public Version1() {//4
		
		super(4);//5
		
		System.out.println("Jarvis");
	}
	
	
	public Version1(int a) {//2
		
		this();//3
		
		this.b();
		
		System.out.println("Chennai");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Version1 ob = new Version1(4);//1
		
		
	}
	
	
	
	//a+b
	
	//10+20
	
	//30+40
	
	
	
	
	

}
