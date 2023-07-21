package Array;

import java.util.ArrayList;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Rahul");
		a.add("Java");
		
		System.out.println(a);
		
		a.add(0, "Student");
		
		System.out.println();
		
		System.out.println(a);
		
	/*	a.remove(1);
		System.out.println(a);
		
		a.remove("Java");   */
		
		a.get(2);
		
		System.out.println(a.get(2));
		
		System.out.println(a.contains("Rahul"));
		
		System.out.println(a.indexOf("Java"));
		
		
		
		
		
		
		
		
		

	}

}
