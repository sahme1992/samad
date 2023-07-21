package Interface;

public class ChildClassDemo extends ParentClassdemo {
	
	
	 public void audioSystem() {
		
		System.out.println("new audio child");
		
	}
	
	public void engine() {
		
		System.out.println("new engine");
	}
	
public void colour() {
		
		System.out.println(colour);
	}

public static void main(String[] args) {
	
	ChildClassDemo cd=new ChildClassDemo();
	
	cd.colour();
	cd.breakes();
	cd.audioSystem();

}


}
