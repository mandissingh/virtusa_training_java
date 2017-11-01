package day2;
import java.util.*;
public class no_of_tiles {

	public static void main(String[] args) {
		int tile = 8;
		int ans;
		Scanner obj = new Scanner(System.in);
		int l = obj.nextInt();
		int b = obj.nextInt();
		int x = l%tile;
		int y = b%tile;
		if(x == 0 && y == 0) ans = 0;
		else if(x!= 0 && y == 0){
			ans = b/8;  
		}
		else if(y!= 0 && x == 0){
			ans = l/8;  
		}
		else{
			ans = (l/8) + (b/8) + 1;
		}
		System.out.print(ans);
	}

}
