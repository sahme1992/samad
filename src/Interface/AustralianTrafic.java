package Interface;

public class AustralianTrafic implements CentralTraffic,ContinentalTraffic  {

	
	public static void main(String[] args) {
		
		AustralianTrafic a=new AustralianTrafic();
		a.redStop();
		a.FlashYellow();
		a.greenGo();
		a.walkonsymbol();
		a.trainSysmbal();
		

	}
	
	public void walkonsymbol() {
		
		System.out.println();
	}

	@Override
	public void greenGo() {
		
		System.out.println("Implementation");
	}

	@Override
	public void redStop() {
		System.out.println("redstop");
		
	}

	@Override
	public void FlashYellow() {
		
		System.out.println("FlashYellow");
		
	}

	@Override
	public void trainSysmbal() {
		// TODO Auto-generated method stub
		
	}

}
