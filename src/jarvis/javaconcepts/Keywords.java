package jarvis.javaconcepts;

public class Keywords {
	
	
	public void add() {
		
		final int a=10;
		
		System.out.println(a);
		
		//a=20;
		
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		Keywords k = new Keywords();
		
		k.add();
	}
	
	/*
	 * private vs final
	 * 
	 * final
	 *   
	 *    class level - can't be inheritance
	 *    method level - can't be override
	 *    variable level - value can't be changed
	 * 
	 * static
	 * 
	 *     method level
	 *     variable level -> same memory reference
	 *     
	 *     static block
	 * 
	 * this
	 * 
	 * super
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
