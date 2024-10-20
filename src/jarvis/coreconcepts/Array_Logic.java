package jarvis.coreconcepts;

public class Array_Logic {
	
	
	public static void main(String[] args) {
		
		
		double rn = Math.random();
		
		int otp =(int) (rn*1000000);
		
		//System.out.println(rn);
		
		//int num = (int) otp;
		
		//System.out.println(otp);
		
		
		int n =5;
		
		int row =5;
		
		int col =3;
		
		int a[] = new int[n];
		
		int x[][]= new int[row][col];
		
		int y[][][]=new int[n][row][col];
		
		//System.out.println(x.length);
		
		x[1][2]=40;
		
		/*
		 *   row ->  0  1  2  3  4
		 *   
		 *   col ->  0  1  2
		 * 
		 * 
		 *   0 0  1 0  2 0  3 0  4 0
		 *   0 1  1 1  2 1  3 1  4 1
		 *   0 2  1 2  2 2  3 2  4 2
		 *   
		 *   
		 *   n   - 0 1 2 3 4
		 *   row - 0 1 2 3 4
		 *   col - 0 1 2
		 *   
		 *   
		 *   0 0 0
		 *   0 0 1
		 *   0 0 2
		 *   
		 *   
		 *    1  2  3  4
		 *    
		 *    10  10  10  10  => 10000 -> 0000 - 9999
		 *    
		 *    10 10 10 10 10 10 10
		 *   
		 *   
		 *   
		 *   
		 *   
		 *   Boss   Manager/CEO   Employee
		 *   
		 *   
		 *   
		 * 
		 * 
		 */
		
		
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				
				System.out.println(i+" "+j);
				
				//System.out.println(x[i][j]);
				
			}
			
		}
		
		
		
		
		
		
	}
	
	
	/*
	 * Mobile
	 *     Samsung
	 *        A Series
	 *           A24 
	 *        M Series
	 *     Iphone
	 *     Redmi
	 * 
	 * 
	 * 
	 */

}
