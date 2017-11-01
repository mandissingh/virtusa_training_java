package day4;
import java.util.*;
import java.text.*;
public class logic1 {

public static Double Average(ArrayList<Integer> array){
		int sum = 0;			// declaring and initializing sum to 0;
		for(int i = 0; i < array.size(); i++){
			sum += array.get(i);
		}
		return (double)sum/array.size();	// Type casting integer to double
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);						 // Scanner object to get input
		DecimalFormat decimalFormatter = new DecimalFormat("#.00");	 // DecimalFormat object to format
		ArrayList<Integer> array = new ArrayList<Integer>();		 // ArrayList to store inputs
		for(int i = 0; i < 20; i++){
			int n = scan.nextInt();	// Taking input into integer
			if(n == -1) break;		// break statement
			array.add(n);			// storing input to the ArrayList
		}
		Double n = Average(array);	// Calling Average function to get average in double
		System.out.println(decimalFormatter.format(n));	// printing Formated output upto 2 Decimals
	}
	
}
