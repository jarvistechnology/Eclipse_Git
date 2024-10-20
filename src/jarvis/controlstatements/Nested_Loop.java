package jarvis.controlstatements;

public class Nested_Loop {

	public static void main(String[] args) {

		for (int i = 1; i<=200; i++) {//1
			
			for (int j = 1; j<=i; j++) { //1)a

				System.out.print(i);//a)1
				
			}
			
			System.out.println();//1)b
		}
		
		
		/*
		 * i=1,1<4 true
		 * 
		 *  j=1, 1<=1 true  ->1
		 *  j=2 ,2<=1 false 
		 *  
		 * i=2 ,2<4 true
		 *  j=1,1<=2 true -> 1
		 *  j=2,2<=2 true -> 2
		 *  j=3 ,3>=2 false
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
		 * 
		 * 
		 *  K   P   M   , A B G
		 *  
		 *  K - A B G
		 *  P - A B G
		 *  M - A B G
		 *  
		 *  A A A
		 *   
		 *  B B B
		 *  
		 *  G G G
		 *  
		 *  
		 *  
		 *  K -   1
		 *  KP -  12
		 *  KPM - 123
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
		 *  
		 *  3 2 1 
		 *  3 2 1
		 *  3 2 1
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		
		
		/*
		 *  1 2 3 
		 *  1 2 3
		 *  1 2 3
		 *  
		 *  
		 *  1 1 1
		 *  2 2 2
		 *  3 3 3
		 *  
		 *  
		 *  3 2 1 
		 *  3 2 1
		 *  3 2 1
		 *  
		 *  
		 *  3 3 3
		 *  2 2 2
		 *  1 1 1
		 *  
		 *  1
		 *  12
		 *  123
		 *  1234
		 *  12345
		 *  123456
		 *  
		 *  
		 *  1
		 *  22
		 *  333
		 *  4444
		 *  55555
		 *  666666
		 *  
		 *  
		 *  
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  1
		 *  2
		 *  3
		 *  1
		 *  2
		 *  3
		 *  1
		 *  2
		 *  3
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * i j i=1 ,1<4 true j=1,1<4 true 1 1 j=2,2<4 true 1 2 j=3,3>4 true 1 3 j=4,4>4
		 * false
		 * 
		 * i=2,2<4 true j=1,1<4 true j=2,2<4 true j=3,3>4 true j=4,4>4 false
		 * 
		 * i=3,3<4 true j=1,1<4 true j=2,2<4 true j=3,3>4 true j=4,4>4 false
		 * 
		 * i=4,4<4 false
		 * 
		 * Console: 1 1 1 2 2 2 3 3 3
		 */

		/*
		 * i=1 , 1<4 true ->1 i=2 , 2<4 true ->2 i=3 , 3>4 true ->3 i=4 , 4>4 false
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
