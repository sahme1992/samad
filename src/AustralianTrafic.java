import demopack.CentralTrafic;

public class AustralianTrafic implements CentralTrafic, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTrafic a=new AustralianTrafic();
		
		a.redStop();
		a.greenGo();
		a.FlashYellow();
		
		
		AustralianTrafic at=new AustralianTrafic();

		at.walkSymbol();
		
		ContinentalTraffic ct=new AustralianTrafic();
		ct.trainSysmbol();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		
		System.out.println("Greenstop implemetation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implemetation");
		
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow implemetation");
		
	}

	public void walkSymbol() {
		
		System.out.println("walikig implemetation");
		
	}

	@Override
	public void trainSysmbol() {
		// TODO Auto-generated method stub
		
	}
}
