package jarvis.mainconcepts;

import java.util.ArrayList;
import java.util.Scanner;

public class List_Con {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Object> al = new ArrayList<>();
		
		//Scanner s = new Scanner(System.in);
		
		al.add("Prabu");//1
		
		al.add("Kishore");
		
		al.add("Preethi");
		
		al.add(1000);
		
		al.add(837587295);
		
		al.add(368);
		
		System.out.println(al);
		
		Object x = al.get(0); //3
		
		System.out.println(al.get(3));
		
		int size = al.size();//2
		
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			
			System.out.println(al.get(i));//get(0)
			
		}
		
		System.out.println();
		
		for (Object name: al) {
			
			System.out.println(name);
			
		}
	}
	
	
	/*
	 * 
	 * List - Interface
	 * 
	 * Index based
	 * 
	 * Insertion Order
	 * 
	 * Duplicate values allow
	 * 
	 * 1.ArrayList
	 * 2.LinkedList
	 * 3.Vector
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
