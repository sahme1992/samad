package Array;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
	
		
		ArrayList <String> a=new ArrayList <String>();
		
		a.add("Samad");
		a.add("java");
		a.add("java");
		
		System.out.println(a);
		
		a.add(0, "student");
		System.out.println(a);
		
		/*a.remove(1);
		a.remove("java");
		System.out.println(a);*/
		
		System.out.println(a.get(2));
		
		//testing is the keyword present or not
		System.out.println(a.contains("Samad"));
		
		System.out.println(a.indexOf("Samad"));
		System.out.println(a.size());
		
		

	}
	
	
	

}



