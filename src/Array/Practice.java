package Array;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("rahul");
		a.add("java");
		a.add("java");
		
		System.out.println(a);
		
		a.add(0, "Student");
		
		System.out.println(a);
		
		/* a.remove(0);
		System.out.println(a);
		
		a.remove("rahul"); */
		
		System.out.println(a.get(2));
		
		System.out.println(a);
		
		System.out.println(a.contains("testing"));
		
		System.out.println(a.indexOf("rahul"));
		System.out.println(a.size());

	}
	


}