package Practices;

public class AustralianTrafic implements CentralTraffic, ContinentalTrafic {

	public static void main(String[] args) {
		
		AustralianTrafic a=new AustralianTrafic();
		a.redStop();
		a.GreenGo();
		a.FlashYellow();
		a.walkonsymbol();
		a.trainSymbol();
		

	}

	@Override
	public void GreenGo() {
		
		System.out.println("GreenGo implementation");
		
	}

	@Override
	public void redStop() {
		
		System.out.println("redStop implementation");
		
	}
	
	public void walkonsymbol() {
		
		System.out.println("walking");
	}

	@Override
	public void FlashYellow() {
		System.out.println("FlashYello implementation");
		
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		
	}

}
