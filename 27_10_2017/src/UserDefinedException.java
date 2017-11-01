
public class UserDefinedException {

	
	public static void main(String[] args) throws AddException {
		int a = 10;
	
			if(a > 9) throw new AddException("Add Exception");
		
		
		

	}

}

class AddException extends Throwable{
	public AddException(String message){
		super(message);
	}
}
