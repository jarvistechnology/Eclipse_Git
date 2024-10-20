package jarvis.controlstatements;

import java.util.Scanner;

public class Switch_Case {
	
	/*
	 * S-1 , M-2.,,,,S-7
	 * 
	 * key - varname
	 * 
	 * value - assign value
	 * 
	 * Enter the first Number
	 * 10
	 * Enter the Operator
	 * + 
	 * Enter the Second Number
	 * 20
	 * Result :30
	 */
	
	static int result;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the First input");
		
		int x = s.nextInt();
		
		System.out.println("Enter the Second input");
		
		int y = s.nextInt();
		
		System.out.println("Enter the Operator:");
		
		// + ,- ,* ,/ ,%
		
		String oper =s.next();
		
		
		
		
		switch (oper) {
		case "+":
			result =x+y;
			System.out.println("Result: "+result);
			break;
			
		case "-":
			result =x-y;
			System.out.println("Result: "+result);
			break;
			
		case "*":
			result =x*y;
			System.out.println("Result: "+result);
			break;
			
		case "/":
			result =x/y;
			System.out.println("Result: "+result);
			break;
			
		case "%":
			result =x%y;
			System.out.println("Result: "+result);
			break;

		default:
			System.out.println("Invalid Operator");
			break;
		}
		
		
		
		
		
		
	}
	

}
