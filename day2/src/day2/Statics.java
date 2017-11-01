package day2;

public class Statics {
	 private int my = 999;
	public static void main(String[] args) {
//		Test t = new Test();
		System.out.print(Base.var);
//		Base.print(10);
//		Base.var = 10;
		Statics s = new Statics();
		access(s);
	}
	static void access(Statics s){
		System.out.print(s.my);
	}
	
}

class Base extends Statics{
	static int data = 20;
	static int var;
	static void print(int x){
		System.out.print(x);
	}
	static void method(){
		System.out.print("i am static method");
	}
	
	
	
	static{
		method();
		var = 10;
		System.out.print("Static called");
		
	}
}