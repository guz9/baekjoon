import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		

		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (m < 45) {
			h--;
			h = h < 0 ? 23 : h;
			System.out.printf("%d %d", h, (m + 60) - 45);
			
		} else {
			System.out.printf("%d %d", h, m - 45);
		}
	}
}