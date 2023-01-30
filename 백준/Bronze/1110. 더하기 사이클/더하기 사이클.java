import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a = num / 10;
		int b = num % 10;
		int c = (a + b) % 10;
		int tem = (b * 10) + c;
		int count = 1;
		
		while (num != tem) {
			a = tem / 10;
			b = tem % 10;
			c = (a + b) % 10;
			tem = (b * 10) + c;
			count++;
		}
		System.out.println(count);
	}
}