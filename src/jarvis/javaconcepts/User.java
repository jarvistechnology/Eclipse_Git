package jarvis.javaconcepts;

import java.util.Scanner;

public class User{
	
	
	//Get inputs from User
	
	//Scanner Class - pre defined
	
	//java.util package
	

	//methods

	
	//next() - only one string value
	
	//nextLine() - more than one string value
	
	//nextInt() - int values
	
	//nextDouble() - double values
	

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
//		System.out.println("Enter your Name:");
//		
//		//String x = "Jarvis";
//		
//		String name = sc.next();
//		
//		System.out.println("Your Name is :"+name);
		
		System.out.println("Enter the first Number");
		
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second Number");
		
		int n2 =sc.nextInt();
				int result = n1+n2;
		
		System.out.println("Result: "+result);
		
		
		
		Apple a = new Apple();
		
		//a.applePrice();
		
		
		//add , sub , mul , div
	}

}
