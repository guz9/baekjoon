import java.util.Scanner;

public class Main {
	public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			
			int hour = sc.nextInt();
			int minute = sc.nextInt();
			
			boolean ch = hour > -1 && hour < 24 && minute >-1 && minute < 60;
			
			if (ch) {
				if (minute >= 45) {
					System.out.printf("%d %d", hour, minute-45);
				}else if (minute < 45 && hour != 0){
					System.out.printf("%d %d", hour-1, minute+15);
				}else {
					System.out.printf("%d %d", hour+23, minute+15);
			}
		}
	}
}