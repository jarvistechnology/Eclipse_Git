package jarvis.oopsconcept;

public class Whatsapp_User extends Whatsapp {

	@Override
	public void dp() {
		
		System.out.println("Gallery Image");
		
	}
	
	
	public static void main(String[] args) {
		
		Whatsapp_User w = new Whatsapp_User();
		
		w.call();
		w.dp();
		
		
	}

}
