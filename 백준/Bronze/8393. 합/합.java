import java.util.*;

public class Main {

	public static int sum(int num) {
		return num == 0 ?  0 :  num + sum(num - 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(Main.sum(num));
	}
}