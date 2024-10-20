package jarvis.mainconcepts;

import java.util.Map;
import java.util.TreeMap;

public class Map_Con {
	
	public static void main(String[] args) {
		
		//Map - interface 
		
		//Key Based
		
		//key and value
		
		//Key - Wrapper Class , duplicate not allowed
		
		//Value - Wrapper Class , duplicated allowed
		
		//HashMap -> Random
		
		//LinkedHashMap -> Insertion
		
		//TreeMap - Ascending
		
		
		
		Map<Integer,String> m = new TreeMap<>();
		
		m.put(751,"Prabu");
		
		m.put(42, "Kishore");
		
		m.put(653,"Preethi");
		
		m.put(444, "Jarvis");
		
		m.put(56544, "Jarvis Tech");
		
		m.put(444, "Preethi");
		
		
		System.out.println(m);
		
		System.out.println(m.size());
		
		
		
		
		
		
		
	}

}
