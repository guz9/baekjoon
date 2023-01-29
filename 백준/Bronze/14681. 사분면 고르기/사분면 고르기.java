import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		String quadrant = "";
		
		if (x < 0) {
			quadrant = y < 0 ? "3" : "2";
		} else {
			quadrant = y < 0 ? "4" : "1";
		}
		
		System.out.println(quadrant);
	}
}