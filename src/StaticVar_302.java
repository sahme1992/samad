
public class StaticVar_302 {

	
	String name;
	String address;
	static String city="Bangalore";
	
	public StaticVar_302(String name, String address) {
		
		this.name=name;
		this.address=address;
		
		
	}
	
	public void getAddress() {
		
		System.out.println(address+" "+city);
		
	}
	
	public static void main(String[] args) {
		
		StaticVar_302 obj=new StaticVar_302("Bob", "Marthalli");
		StaticVar_302 obj1=new StaticVar_302("Ram", "JayaNagar");
		
		obj.getAddress();
		obj1.getAddress();
		
		
		
		

	}

}
