package Super;

public class childDemo extends ParentDemo{
	
	public childDemo() {
		
		super();
		
		System.out.println("Child class constructor");
		
	}
	
	String name="Qacskhdjsjdj";
	
	public void getString() {
		
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		
		super.getData();
		System.out.println("I am chld class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childDemo cd=new childDemo();
		
		cd.getString();
		
		cd.getData();

	}

}
