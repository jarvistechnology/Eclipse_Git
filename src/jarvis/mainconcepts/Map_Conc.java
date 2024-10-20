package jarvis.mainconcepts;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_Conc {
	
	public static void main(String[] args) {
		
		//Key + Value = Entry
		
		Map<Object,Object> m = new TreeMap<>();
		
		m.put(671, "Prabu");
		
		m.put(8682, "Kishore");
		
		m.put(6863, 9846986);
		
		m.put(68664, "Kanmani");
		
		System.out.println(m);
				
	
		System.out.println(m.size());
		
		boolean containsKey = m.containsKey(8682);
		
		System.out.println(containsKey);
		
		System.out.println(m.containsValue("Kanmani"));
		
		Set<Object> ks = m.keySet();
		
		System.out.println(ks);
		
		Collection<Object> values = m.values();
		
		System.out.println(values);
		
		Set<Entry<Object, Object>> es = m.entrySet();
		
		System.out.println(es);
		
		System.out.println(m.get(671));
		
	}

}
