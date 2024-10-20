package jarvis.controlstatements;

public class While_Loop {

	// For

	// While
	
	//One time true , one time false
	
	//Entry Level Condition Checking

	public static void main(String[] args) {

		int a = 10;

		int b = 3;

		while (a < b) {//10>3 ,5>4 ,-1>5

			System.out.println(a+b);//10+3=13 ,9
			
			a--;//9 , 4
			
			b++;//4 , 5
			
			a=a-b;//9-4=5, 4-5=-1
			
			System.out.println(a*b);//5*4=20 ,-5
			
			
			//13,20,9,-5

		}

	}

}
