package jarvis.controlstatements;

public class PrePost {
	
	
	//Control Statements
	
	//1.Loop Statement
	
	//2.Conditional or Decision Making Statements
	
	//3.Jumping Statement
	
	
	
	//Pre Increment     ++a  => 1+a 
	
	//Pre Decrement     --a  => -1+a
	
	//Post Increment    a++  => a+1
	
	//Post Decrement    a--  => a-1
	//System.out.println(++a);//6
	
	//System.out.println(a);//6
	
	
	//++a   => 1+5
	
	//a++   => 5+1
	
	
	//ODD or EVEN
	
	
	
	public static void main(String[] args) {
		
		
		int a=5;
		
		int b=3;
		
		a++;//5+1=6(5)
		
		b--;//3-1=2(3)
		
		a--;//6-1=5(6)
		
		--b;//-1+2=1
		
		--b;//-1+1=0
		
		a--;//5-1=4(5)
		
		System.out.println(a++  +   --b  +  a--);
		
		//(4+1=5(4)   +     -1+0=-1    +   5-1=4(5)    =>  4 +(-1)+5 => 4-1+5= 8 )
		
		System.out.println(++a  +  ++b  +  a++);
		
		//(1+4=5     +     1+(-1)=0      +    5+1=6(5)  =>    5 + 0 + 5  => 10     )
		
		System.out.println(a++  -   b--);
		
		//  (6+1=7(6)   -   0-1=-1(0)   =>    6 - 0  =>  6   )
		
		System.out.println(a++); // 7+1=8(7)   => 7
		
		System.out.println(b--); //-1-1 =-2(-1)  => -1
		
		
		//8  10   6  7  -1
		
		//Kishore -> 
		//Poornima -> 11 12 1 4 3
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
