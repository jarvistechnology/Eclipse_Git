package jarvis.mainconcepts;

public class String_Fun {
	
	
	public static void main(String[] args) {
		
		
		String s1 = "Welcome to Jarvis";
		
		String s2 = "welcome to jarvis";
		
		String s3 = "Java";
		
		String s4 = "Selenium";
		
		String s5 ="Hello,World           ";
		
		
		String s6 = "Paragraphs can contain many different kinds of information. A paragraph could contain a series of brief examples or a single long illustration of a general point. It might describe a place, character, or process; narrate a series of events; compare or contrast two or more things; classify items into categories; or describe causes and effects. Regardless of the kind of information they contain, all paragraphs share certain characteristics. One of the most important of these is a topic sentence.";
		
		
		int length = s3.length();//1
		
		System.out.println(length);
		
		String upperCase = s1.toUpperCase();//2
		
		System.out.println(upperCase);
		
		System.out.println(s1.toLowerCase());//3
		
		boolean x = s1.equals(s2);//4
		
		System.out.println(x);
		
		boolean a = s1.equalsIgnoreCase(s2);//5
		
		System.out.println(a);
		
		
		System.out.println(s1.startsWith("ja"));//6
		
		System.out.println(s1.endsWith("is"));//7
		
		System.out.println(s1.contains("arv"));//8
		
		
		
		System.out.println(s3+s4);
		
		System.out.println(s3.concat(s4));//9
		
		
		 int indexOf = s1.indexOf("J");//10
		
		
		System.out.println(indexOf);
		
		int lastIndexOf = s1.lastIndexOf("e");//11
		
		System.out.println(lastIndexOf);
		
		
		char charAt = s1.charAt(5);//12
		
		System.out.println(charAt);
		
		
		String replace = s1.replace("e", "a");//13
		
		System.out.println(replace);
		
		
		System.out.println(s1.replace("to", "for"));
		
		
		
		String substring = s1.substring(4);//14
		
		System.out.println(substring);
		
		
		System.out.println(s1.substring(4, 12));
		
		
		System.out.println(s1.trim());//15
		
		System.out.println(s5);
		
		System.out.println(s5.trim());
		
		

		
		String[] spl = s5.split(",");//16
		
		
		for (String s : spl) {
			
			System.out.println(s);
			
	
			
		}
		
		
		//System.out.println(count);
		
		
		
		
		//Welcome to Jarvis
		
		
		//W
		//lcom
		// to Jarvis
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
