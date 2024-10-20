package jarvis.oopsconcept;

public class Addition implements Calculator,Project_Name{

	@Override
	public void numbers(int a, int b) {
		
		System.out.println(a+b);
		
	}

	@Override
	public void name(String name) {
		
		System.out.println("Project Name: "+name);
		
	}

	@Override
	public void add(String x) {
		// TODO Auto-generated method stub
		
	}

	
	
	//class to class = extends
	
	//interface to class => implements
	
	

}
