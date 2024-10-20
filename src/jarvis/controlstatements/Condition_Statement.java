package jarvis.controlstatements;

import java.util.Scanner;

public class Condition_Statement {

	// Loop Statements

	// Condition Statement

	// if else statement
	// switch case

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();

		int b = s.nextInt();

		if (a <= b) {

			System.out.println(a + " is lesser than " + b);

		}

		else if (a >= b) {

			System.out.println(a + " is greater than " + b);
		}

		else { //default

			System.out.println("not valid");
		}

	}

}
