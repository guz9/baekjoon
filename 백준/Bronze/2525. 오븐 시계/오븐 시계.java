import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int timer = sc.nextInt();
		
		int timeMin = timer%60;
		int timeHour = timer/60;
		
		boolean ch = hour > -1 && hour < 24 && min >-1 && min < 60 && timer >=0 && timer <= 1000;
		
		if (ch) {
			if (timer <= 60) {
				if (min + timer < 60) {
					System.out.printf("%d %d", hour, min+timer);
				}else if(min + timer >= 60 && hour <23) {
					System.out.printf("%d %d", hour+1, min+timer-60);
				}else if(min + timer >= 60 && hour == 23) {
					System.out.printf("%d %d", hour-23, min+timer-60);
				}
			}else if(timer >60) {
				if (min + timeMin<60 && hour + timeHour<24) {
					System.out.printf("%d %d", hour+timeHour, min+timeMin);
				}else if (min + timeMin<60 && hour + timeHour>=24) {
					System.out.printf("%d %d", hour+timeHour -24, min+timeMin);
				}else if (min + timeMin>=60 && hour + timeHour+1<24) {
					System.out.printf("%d %d", hour+timeHour+1, min+timeMin-60);
				}else if (min + timeMin>=60 && hour + timeHour+1>=24) {
					System.out.printf("%d %d", hour+timeHour+1-24, min+timeMin-60);
				}
			}
		}
	}
}