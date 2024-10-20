package jarvis.controlstatements;

public class Re {
	
	
	public static int num() {
		try {
			return 10;
		} catch (Exception e) {
			
		}
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		
		int x = num();
		
		System.out.println(x);
		
	}

}
