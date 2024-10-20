package jarvis.oopsconcept;

public class Variables_Types {
	
	int x; //class variable
	
	static int y=450;

	public void add() {

		//int a;
		
		//System.out.println(a);
		
		//System.out.println(x);
		
		System.out.println(y);

	}
	
	
	public static void sub() {
		
		//Variables_Types vt = new Variables_Types();
		
		//System.out.println(vt.x);
		
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		Jarvis j = new Jarvis();
		
		Variables_Types v= new Variables_Types();
		
		v.add();
		
		sub();
		
		int a=23;
		
		//System.out.println(a);//23
		
		//System.out.println(v.x);
		
		System.out.println(y);
		

	}
	
	
	//Types of Variable:
	
	/*
	 * 1.Local Variable
	 *   Inside the method body or block
	 *   Priority will be high
	 *   must be initialize the values
	 *   
	 *   
	 * 2.Class or Instance Variable (Global Variable)
	 *    
	 *    Outside the method but inside the class
	 *    Must need an Object
	 *    If not be initialized ,it will take default values
	 *    
	 * 3.static Variable
	 *    Same as Class Variable
	 *    without using an Object
	 *    Local Variable can't be use as static variable
	 * 
	 */

	//Default value of String -> null
	//Default value of int -> 0
	
}
