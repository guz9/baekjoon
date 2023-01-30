import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 1; i <= t; i++) {
			for (int j = t; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}