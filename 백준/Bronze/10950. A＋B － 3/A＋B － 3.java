import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] num = new String[t];
		sc.nextLine();
		
		for (int i = 0; i < t; ++i) {
			num[i] = sc.nextLine();
			num[i] = (Integer.parseInt(num[i].substring(0, 1)) + 
				Integer.parseInt(num[i].substring(2, 3))) + "";
		}
		
		for (int i = 0; i < num.length; ++i) {
			System.out.println(num[i]);
		}
	}
}