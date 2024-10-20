package jarvis.mainconcepts;

public class Stypes {
	
	//Literal vs Non Literal
	
	//Mutable vs Immutable
	
	//StringBuffer vs StringBuilder - Mutable,  
	
	
	
	//Immutable - If duplicate values will be create , it will use the same memory reference
	
	//if any changes in value , it will create new memory reference
	
	//Memory same and its identity also same - Literal
	
	
	//String always immutable
	
	public static void main(String[] args) {
		
		
		System.out.println("String - Literal / Immutable");
		
		System.out.println("=================================");
		
		String s1 = "Chennai";
		
		String s2 = "Chennai";
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());//memory - address
		
		System.out.println(s2.hashCode());
		
		System.out.println(System.identityHashCode(s1));//Identity
		
		System.out.println(System.identityHashCode(s2));
		
		
		
		s2=s2+",Tamilnadu";
		
		System.out.println(s2);
		
		System.out.println(s2.hashCode());
		
		
		//Memory same and its identity will be different - Non-Literal & Immutable
		
		System.out.println();
		
		System.out.println("String - Non-Literal / Immutable");
		
		System.out.println("=================================");
		
		
		String str1 = new String("India");
		
		String str2 = new String("India");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1==str2);
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());//memory
		
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));//Identity
		
		System.out.println(System.identityHashCode(str2));
		
		
		System.out.println();
		
		System.out.println("StringBuffer/Builder - Non-Literal / mutable");
		
		System.out.println("=================================");
		
		
		StringBuffer sb1 = new StringBuffer("Porur");
		
		StringBuffer sb2 = new StringBuffer("Porur");
		
		System.out.println(sb1);
		
		System.out.println(sb2);
		
		System.out.println(sb1==sb2);
		
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.hashCode());//memory
		
		System.out.println(sb2.hashCode());
		
		
		System.out.println(System.identityHashCode(sb1));//Identity
		
		System.out.println(System.identityHashCode(sb2));
		
		
		sb2=sb2.append(",Chennai");
		
		System.out.println(sb2);
		
		System.out.println(sb2.hashCode());
		//Mutable - if duplicate values will be create , it will create different new memory
		
		//if any changes in values , it use the same memory reference
		

		//StringBuffer - sync,thread safe , slow
		
		//StringBuilder - Async , thread not safe , fast
	}

}
