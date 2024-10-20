package jarvis.mainconcepts;

public class MultiArray {
	
	public static void main(String[] args) {
		
		
		int x[] = new int[4];// 1 dimension
		
		int x1[] = {10,20,30,49};
		
		int a[][] = new int[2][2];// 2 dimension
		
		
		int a1[][] = {{10,20},{30,40}};
		
		
		int b[][][]= new int[2][2][2]; //3 dimension		
		
		
		//4 6  
		
		
		//1.5 -> 50 -> 75 crs  -> 65crs
		
		//2 Crore -> 1st Price
		//10 Lakhs ->2nd Price
		
		
		
		
		/*
		 *  8 teams , 70 matches
		 * 
		 * 10 teams , 70 matches
		 * 
		 *  1 team , 14 matches
		 * 
		 *      
		 * 
		 * 1     1
		 * 
		 * 2     2
		 * 
		 * 3     3
		 * 
		 * 4     4
		 * 
		 * 5     5
		 * 
		 * 6     6
		 * 
		 * 7     7
		 * 
		 * 8     8
		 * 
		 * 9     9
		 * 
		 * 10   10
		 */
		
		
		
		
		
		
		
		
		
		
		
		a[0][0] = 1;
		a[0][1] = 2;
		
		a[1][0] = 3;
		a[1][1] = 4;
		
		
		b[1][0][1]=30;
		
		
		//3 => 0 1 2
		
		//3 => 0 1 2
		
		
		/*
		 *  0 0  -> 10
		 *  0 1  -> 20
		 *  0 2  ->  0
		 *  
		 *  
		 *  1 0  -> 30
		 *  1 1  -> 40
		 *  1 2  ->  0
		 *  
		 *  2 0  ->  0
		 *  2 1  ->  0
		 *  2 1  ->  0
		 *  
		 * 
		 *   
		 *   1  2
		 *   3  4
		 *  
		 *  
		 *  
		 *  3 D
		 *  
		 *  2 -> 0  1
		 *  
		 *  2 -> 0  1
		 *  
		 *  2 -> 0  1
		 *  
		 *  i=0 , 0<2 ,true
		 *  
		 *    j=0 ,0<2 true
		 *    
		 *      k=0 ,0<2 true      b[0][0][0]
		 *      k=1,1<2 true       b[0][0][1]
		 *      k=2 ,2<2 false
		 *  
		 *    j=1 ,1<2 true
		 *     k=0 ,0<2 true       b[0][1][0]
		 *     k=1, 1<2 true       b[0][1][1]
		 *     k=2 ,2<2 false  
		 * 
		 *   j=2 , 2<2 false
		 *   
		 * i=1 , 1<2 ,true
		 *  
		 *     j=0 ,0<2 true
		 *    
		 *      k=0 ,0<2 true      b[1][0][0]
		 *      k=1,1<2 true       b[1][0][1]
		 *      k=2 ,2<2 false
		 *  
		 *    j=1 ,1<2 true
		 *     k=0 ,0<2 true       b[1][1][0]
		 *     k=1, 1<2 true       b[1][1][1]
		 *     k=2 ,2<2 false  
		 * 
		 */
		
		
		for (int i = 0; i < b.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				for (int k = 0; k < b.length; k++) {
					
					//System.out.println(b[i][j][k]);
					
				}
				
			}
			
		}
		
		
		
		
		
//		 [1  1  1
//		 
//		 2  3  2
//		 
//		 1  2  3]
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(a[1][0]);
		
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				System.out.println(a[i][j]);
				
			}
			
		}
		
		
		/*
		 * i=0 , 0<2 true
		 * 
		 *   j=0 ,0<2 true    a[0][0]
		 *   j=1 ,1<2 true    a[0][1]
		 *   j=2, 2<2 false 
		 *   
		 * i=1 ,1<2 true
		 *   j=0 ,0<2 true    a[1][0]
		 *   j=1 ,1<2 true    a[1][1]
		 *   j=2, 2<2 false 
		 *   
		 * i=2 , 2<2 false
		 * 
		 */
		
		
		
		
		/*
		 * 0-1
		 * 
		 * 0 0
		 * 0 1
		 * 
		 * 1 0
		 * 1 1
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
	}

}
