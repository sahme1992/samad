package ThisDemo;

public class ThisDemo {

	int a=2;
	public void getData() {
		
		int a=3;
		System.out.println(this.a);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo dd=new ThisDemo();
		
		dd.getData();
		


	}

}
