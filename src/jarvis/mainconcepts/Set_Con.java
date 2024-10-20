package jarvis.mainconcepts;

import java.util.HashSet;
import java.util.Set;

public class Set_Con {
	
	
	//Set - Interface 
	
	//List - index based , insertion order , duplicates allow
	
	//Set - value based ,Random Order, Duplicate not allowed
	
	//HashSet - Class -> Random
	
	//LinkedHashSet - Class -> Insertion Order
	
	//TreeSet - Class -> Ascending Order
	
	
	
	public static void main(String[] args) {
		
		
		Set<Object> hs = new HashSet<>();
		
		hs.add("Prabu");
		
		hs.add("Kishore");
		
		hs.add("Preethi");
		
		hs.add("Prabu");
		
		hs.add("jarvis");
		
		hs.add("apple");
		
		hs.add(1007850);
		
		hs.add(4300);
		
		hs.add(35700);
		
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		for (Object x : hs) {
			
			System.out.println(x);
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
