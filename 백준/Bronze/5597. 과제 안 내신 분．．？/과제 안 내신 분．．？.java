import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] stu = new boolean[30];
		
		for (int i = 0; i < 28; ++i) {
			int num = Integer.parseInt(br.readLine()) - 1;
			stu[num] = true;
		}
		for (int i = 0; i < stu.length; ++i) {
			if (stu[i] == false) {
				System.out.println(i + 1);
			}
		}
	}
}