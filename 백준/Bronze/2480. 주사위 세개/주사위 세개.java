import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		

		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		int cash = 0;
		
		if (first != second && second != third && third != first) {
			int max = Math.max(first,second);
			max = Math.max(max, third);
			cash = max * 100;
		} else {
			if (first == second && second == third && third == first) {
				cash = 10000 + first * 1000;
			} else {
				int equals = 
						first == second ? 
								first : second == third ? second : third;
				cash = 1000 + equals * 100;
			}
		}
		System.out.println(cash);
	}
}