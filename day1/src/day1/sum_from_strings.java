package day1;
import java.util.*;

public class sum_from_strings {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String in = obj.nextLine();
		int sum = 0;
		ArrayList<Character> a = new ArrayList<Character>();
		for(int i = 0; i < in.length(); i++){
			if(in.charAt(i) == ','){
				sum += converter(a);
				a.clear();
				continue;

			}
			a.add(in.charAt(i));
			
		}
		sum += converter(a);
		System.out.print(sum);
	}
	
	public static int converter(ArrayList<Character> a){
		StringBuilder s = new StringBuilder(a.size());
		for (char c : a)
		    s.append(c);
		String result = s.toString();
		return Integer.parseInt(result);
	}

}
