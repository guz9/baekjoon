import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		

		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();

		int endH = h + ((m + t) / 60);
		int endM = (m + t) % 60;
		
		endH = endH > 23 ? endH % 24 : endH;
		
		System.out.printf("%d %d", endH, endM);
	}
}