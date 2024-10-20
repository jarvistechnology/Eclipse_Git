package jarvis.controlstatements;

import java.util.Scanner;

public class Loop_Con {
	
	/*
	 * Loop - Repeat again and again
	 * 
	 *   1.For Loop - index based
	 *   2.While Loop
	 *   3.Do While Loop
	 *   4.For Each
	 *   
	 *   Nested Loop - loop within another loop
	 *   
	 *   index starts with zero , ends with n-1
	 *   
	 *   n- no of values or size or length
	 *   
	 *   10 values
	 *   
	 *   0 - 9
	 *   
	 *   syntax for loop:
	 *   
	 *   for(initial;condition;incre/decre){ //true 
	 *   
	 *   //statement or task
	 *   
	 *   }
	 *   
	 *   
	 *  1.Starting value
	 *  2.check with condition
	 *  2)a if true -> body will be executes
	 *  
	 *  2)b if false - loop will end
	 *  
	 *  
	 *  must one time true
	 *  
	 *  must one time false
	 *   
	 * 
	 */

	
	//Console:
	
	//Welcome
	
	
	public static void square(int num) {
		
		int sq=num*num;
		
		System.out.println("Square value of "+num+" is: "+sq );
	}
	
	
	
	
	public static void main(String[] args) {
		
		
//		for(int i=15;i<=20;i++) {
//			
//			
//			System.out.println("Cube value of "+i+" is: "+(i*i*i));
//			
//		}
		
		//odd 
		
		//even 
		
		int count =0;
		                         //2+1=3(2)
		for (int i = 1; i <=10; i++) {
			
			System.out.println(++i);//1+1=2
			
			count++;//2+1
			
		}
		
		System.out.println();
		
		System.out.println("Total Count: "+count);
		
		
		///18
		
		
		
		//2+2+2+2+2 = 10
		
		//2*5 = 10
		
		//30*40 = 1200
		
		
		
		
		//int a=10;
		
		//a<12
		
		
		//System.out.println("Welcome");//1000 lines
		
		//user defined method - 100 *10(Call 10 times)
		
		//2 lines 
		
		/*
		 * i=0, 0<10 true
		 * 
		 * 
		 * 
		 * 
		 * i=-1, -1<10 true
		 * 2......9 true
		 * 
		 * i=10,10<10 false
		 * 
		 * 
		 */
		
		/*
		 * Console:
		 * 
		 * Welcome
		 * Welcome
		 * 
		 * 
		 * 1 to 25 -> square value and cube value
		 * 
		 * 8 square value -> 64
		 * 
		 * 5 cube value -> 5*5*5 = 125
		 * 
		 * 
		 * 
		 * 
		 */
		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("Enter the Number");
//		
//		int num=s.nextInt();
//		
//		int sq = num*num;
//		
//		System.out.println("Square value of "+num+"="+sq);
//		
		
		
		
		
		
	}
	
}
