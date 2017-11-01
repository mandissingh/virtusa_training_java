package day2;

public class Encapsuation {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.print(t.change(11));

	}


}
class Test{
	protected int data = 10;
	public int change(int x){
		this.data = x;
		return x;
	}
}

class Beta extends Test{
	public void print(){
		System.out.print(super.data);
	}
}