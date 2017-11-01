
public class Final_keyword {

	final int key = 10;
	public static void main(String[] args) {
		//key = 20;   Gives Error

	}

}

final class Fin{}
abstract class Base // extends Fin Gives Error
{
	final void kill(){
		System.out.print("Killed in base");
	}
}

class Child extends Base{
//	void kill(){
//		System.out.print("Killed in child");
//	}	Gives Error
}
