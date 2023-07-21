package ConstructorDemo;

public class constructorDemo {
	
	
	public constructorDemo() 
	
	{
		System.out.println("I am in the constractor");
		
	}
	
	public constructorDemo(int a, int b) {
		
		System.out.println("I am in the parameterized constractor");
	}
	
	public void getdata() {
		
		System.out.println("I am the method");
	}
	

	public static void main(String[] args) {
		
		
   constructorDemo cd=new constructorDemo();
   
   constructorDemo cd1=new constructorDemo(10, 20);
   
   
	}

}
