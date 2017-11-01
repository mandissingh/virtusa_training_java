
public class Abstraction {

	
	public static void main(String[] args) {
		Base b = new Child();
		b.run();
	}

}

abstract class Base{
	abstract void run();
	void kill(){
		System.out.print("Killed in base");
	}
}

class Child extends Base{
	void run(){
		System.out.print("Something is running");
	}
	
	void kill(){
		System.out.print("Killed in child");
	}
}
