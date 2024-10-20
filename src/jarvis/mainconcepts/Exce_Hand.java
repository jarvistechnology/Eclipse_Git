package jarvis.mainconcepts;

import java.util.Scanner;

public class Exce_Hand {
	
	public static void main(String[] args) {
		
		//try catch finally
		
		//InputMismatch
		//
		
		
		
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the a value:");
		
		int a=s.nextInt();
		
		System.out.println("Enter the b value:");
		
		int b=s.nextInt();
		
		
		try {
			
			int c =a/b;
			
			System.out.println(c);
			
		} finally {
			
			System.out.println("Logo");
			
		}
		
		
		System.out.println("Thank You");
		
		
		
		
		
//		try {
//			
//			String ss="";
//			
//			System.out.println(ss.length());
//			int c =a/b;
//			System.out.println(c);
//			
//		} catch (Exception e) {
//			System.err.println("Cannot divided by Zero");
//		}
		
		
		
		
		
		
	}

}
