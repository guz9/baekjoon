import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.nextLine();
		String b_ = sc.nextLine();
		
		int b = Integer.parseInt(b_);
		int b1 = Integer.parseInt(b_.substring(0, 1));
		int b2 = Integer.parseInt(b_.substring(1, 2));
		int b3 = Integer.parseInt(b_.substring(2, 3));
		
		System.out.println(a * b3);
		System.out.println(a * b2);
		System.out.println(a * b1);
		System.out.println(a * b);
	}
}