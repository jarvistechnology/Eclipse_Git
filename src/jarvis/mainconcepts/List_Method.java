package jarvis.mainconcepts;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Method {
	
	
	public static void main(String[] args) {
		
		//Index , Insertion 
		
		//List -> Interface
		
		//ArrayList -> Search and Retrieve
		                                //   - Async
		//LinkedList -> Insert adn delete
		
		//Vector -sync //
//		
//		ArrayList<Object> al = new ArrayList<>();
//		
//		al.add("Jarvis");
//		
//		al.add(50);
//		
//		al.add(1,"Tech");
//		
//		al.add(1,"School");
//		
//		al.add(2,"Tech");
//		
//		System.out.println(al);
//		
//		System.out.println(al.get(1));
//		
//		al.set(2, "Technology");
//		
//		System.out.println(al);
//		
//		System.out.println(al.indexOf(50));
//		
//		System.out.println(al.contains("Tech"));
//		
//		System.out.println(al.remove(2));
//		
//		System.out.println(al);
//		
//		al.remove("School");
//		
//		System.out.println(al);
//		
		
		//retainAll // common 
		
		//removeAll // specific
		
		//addAll //merge
		
		
		
		Vector<Object> l1 = new Vector<>();
		
		Vector<Object> l2 = new Vector<>();
		
		
		List<Object> l = new Vector<>();
		
		
		l1.add("Prabu");
		
		l1.add("Jarvis");
		
		l1.add("Kishore");
		
		l1.add(10000);
		
		System.out.println(l1);
		
		
		l2.add("Prabu");
		
		l2.add("Greens");
		
		l2.add("Kanmani");
		
		l2.add(10000);
		
		System.out.println(l2);
		
		
		//l1.retainAll(l2);
		
		//System.out.println(l1);
		
		
		//l1.removeAll(l2);
		
		l1.addAll(l2);
		
		System.out.println(l1);
		
		
		l1.clear();
		
		System.out.println(l1);
		
		
		
		
	}

}
