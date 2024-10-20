package jarvis.mainconcepts;

public class Array_Con {

	public static void main(String[] args) {

		// Array - Storing multiple values in single variable

		// index based

		// index starts with 0 and ends with n-1 , where n is no of size

		// fixed length or size

		// datatype arrname[] = new datatype[size];

		// similar datatypes
	
		// memory waste high
		
		//it will overcome by Collection
		
		
		//single Dimension array
		
		//Multi Dimension Array
		
		

		int a[] = new int[10]; // n=5

		a[0] = 10;

		a[1] = 20;

		a[3] = 40;

		a[4] = 50;
		
		
		for (int b : a) {
			
		}

		for (int i = 0; i < a.length; i++) {

			// System.out.println(a[i]);

		}

		String name[] = new String[4];

		name[0] = "Prabu";

		name[1] = "Meena";

		name[2] = "Venkat";

		name[3] = "Preethi";
		

		System.out.println("For Each");
		System.out.println("-------------");
		
		//forward only

		for (String n : name) {

			System.out.println(n);

		}
		
		System.out.println();

		System.out.println("For Loop");
		System.out.println("-------------");
		
		//forward and backward
		//between 
		
		for (int i = 0; i < name.length; i++) {

			System.out.println(name[i]);

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		for (int i = name.length-1; i >= 0; i--) {

			// System.out.println(name[i]);

		}

		// datatype arrname[] = { };

		int x[] = { 10, 20, 203, 3494, 3334, 2,33, 222, 34, 223, 3 };

		String fruits[] = { "apple", "Banana", "Mango" };
		
		
		
		for (String fruit : fruits) {
			
			System.out.println(fruit);
			
		}
		
		

//		System.out.println(x.length);

		// System.out.println(fruits[2]);

		int size = x.length;

		// System.out.println(size);

		for (int i = 0; i < size; i++) {

			// System.out.println(x[i]);

		}

		/*
		 * i=0 ,0<10 true a[0] = 10
		 * 
		 * i=1,1<10 true
		 * 
		 * 
		 */

		// Non Primitive

		// Array
		// String
		// Class
		// Interface

	}

}

//
//int a=10;
//
//a=20;
//
////No Method Calling

/*
 * Java Intro Java Install Coding Standard IDE - Eclipse Access Modifier Garbage
 * Collection Data Types - Primitive and Non Primitive OOPs - Class , Method ,
 * Object Main Method Return Type Parameter static OOPs Concepts Encapsulation
 * Inheritance PolyMorphism - Method Overload and Method Override Abstraction -
 * Abstract Class and Interface Variable Types - Local,Class,static Constructor
 * , Constructor Chaining Keywords - this,super ,final ,static Type Casting
 * Control Statements Loops - For Loop , Nested For Loop , While , Do while
 * Condition - If else , Switch case Jumping - break , continue Scanner Class
 * Operators Pre Post
 * 
 * Array
 * 
 * String Types String Method
 * 
 * Collection
 * 
 * Exception
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
