package Practices;

public class childClasssDemo extends ParentsClassDemo  {

	
	 public void engine() {
		 
		 System.out.println("new emgine");
	 }
	
	 
       public void color() {
		 
		 System.out.println(colour);
	       }
       
       
       
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childClasssDemo cd=new childClasssDemo();
		
		
		
		cd.color();
		
		
		
		
		cd.engine();
		

	}

}
