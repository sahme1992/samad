package Practices;

public class ChildEmirites extends paraetAirCraft {

	public static void main(String[] args) {
		
		ChildEmirites c=new ChildEmirites();
		
		c.bodyColor();
		c.safteyGuilines();
		c.engine();
		
		//paraetAirCraft p=new paraetAirCraft();

	}

	
	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
