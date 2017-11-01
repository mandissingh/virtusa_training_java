
public class Interfaces {

	public static void main(String[] args) {
		Draw d1 = new Circle();
		d1.draw();
		Draw d2 = new Square();
		d2.draw();

	}

}

interface Draw{
	void draw();
//	void print(){
//	Error given	
//	}
	
}

class Circle implements Draw{
	public void draw(){
		System.out.println("Circle is drawn");
	}
}

class Square implements Draw{
	public void draw(){
		System.out.println("Square is drawn");
	}
}
