package day4;
import java.util.*;
public class logic2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		// Scanner object to get input
		int n = scan.nextInt();						// Getting input into integer
		String format = "%-8s%-8s%-8s%-8s%n";		// Setting printing format
		System.out.printf(format, "N", "10*N", "100*N", "1000*N");	// Printing first table header
		// looping till the input range
		for(int i = 0; i < n; i++){					
			System.out.printf(format, n, n*10, n*100, n*1000);		// Printing formated table rows
		}
	}

}
