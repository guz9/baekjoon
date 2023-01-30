import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int copy = num;
		int count = 0;
		
		while (true) {
			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
			count++;
			if (copy == num) {
				break;
			}
		}
		System.out.println(count);
	}
}