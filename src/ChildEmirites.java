
public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args) {
		
		ChildEmirites c=new ChildEmirites();
		c.engine();
		c.SafetyGuidelines();
		c.bodyColor();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
		
	}
	
	
	

}
