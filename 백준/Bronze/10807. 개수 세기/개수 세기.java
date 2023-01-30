import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String n_ = br.readLine();
		int[] num = new int[n]; 
		int v = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i < n; ++i) {
			num[i] = Integer.parseInt(n_.split(" ")[i]);
			if (v == num[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}