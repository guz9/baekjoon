import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int num = sc.nextInt();

		int sum = 0;
		
		for (int i = 0; i < num; ++i) {
			int item_price = sc.nextInt();
			int item_num = sc.nextInt();
			
			sum = sum + (item_price * item_num);
		}

		String result  = total == sum ? "Yes" : "No";
	
		System.out.println(result);
	}
}