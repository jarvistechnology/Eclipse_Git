package jarvis.controlstatements;

public class Grade {

	// 91-100 - S
	// 81-90 - A
	// 71-80 -B
	// 61-70 -C
	// 51-60 - D
	// 35-50 - E
	// below 35 - Fail or RA
	
	
	
	
	//T+E+M+S+SS = total
	
	//per = total/5;
	
	//433/500 = 86
	
	//
	

	public static void main(String[] args) {

		int mark = -2;

		if (mark > 90 && mark <= 100) {
			System.out.println("S Grade");
		}
		else if (mark > 80 && mark <= 90) {
			System.out.println("A Grade");
		}
		else if (mark > 70 && mark <= 80) {
			System.out.println("B Grade");
		}
		else if (mark > 60 && mark <= 70) {
			System.out.println("C Grade");
		} 
		else if (mark > 50 && mark <= 60) {
			System.out.println("D Grade");
		} 
		else if (mark >= 35 && mark <= 50) {
			System.out.println("E Grade");
		}
		else if (mark>100 || mark<0) {
			
			System.out.println("Invalid Mark");
		}

		else {

			System.out.println("Failed(RA)");
		}

	}

}
