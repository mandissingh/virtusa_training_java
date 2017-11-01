
public class Polymorphism {

	public static void main(String[] args) {
		Base b = new Child();
		b.run();
		System.out.println(sum(5,7));
		System.out.println(sum(5.4,7.6));
	}
	
	public static int sum(int a, int b){
		return a+b;
	}
	
	public double sum(double a, double b){
		return a+b;
	}

}

abstract class Base{
	void run(){}
	void kill(){
		System.out.print("Killed in base");
	}
}

class Child extends Base{
	@Override void run(){
		System.out.print("Something is running");
	}
	
	void kill(){
		System.out.print("Killed in child");
	}
}