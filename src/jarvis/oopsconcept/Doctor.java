package jarvis.oopsconcept;

public class Doctor {//Doctor - Class
	
	
	
	public void tablet() { //method
		
		System.out.println("Tablet");
	}
	
	public void hospital() {
		
		System.out.println("Hospital");
	}
	
	
	public static void main(String[] args) {
		
		
		Doctor x = new Doctor();  // x- object
		
		x.tablet();
		x.hospital();
		
	}


}
