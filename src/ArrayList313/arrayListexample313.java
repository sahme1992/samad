package ArrayList313;

import java.util.ArrayList;

public class arrayListexample313 {

	public static void main(String[] args) {
	
		ArrayList <String> a=new ArrayList<String>();
		a.add("Rahul");
		a.add("Java");
		
		System.out.println(a);
		
		a.add(0, "Student");
		System.out.println(a);
		
		//a.remove(1);
		
		System.out.println(a);
		
		System.out.println(a.contains("Rahul"));
		
		System.out.println(a.indexOf("Rahul"));
		
		System.out.println(a.size());
		
		

	}

}
