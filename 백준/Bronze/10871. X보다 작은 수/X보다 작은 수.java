import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String nums = br.readLine();
		
		String[] ss = s.split(" ");		
		
		int n = Integer.parseInt(ss[0]);
		int x = Integer.parseInt(ss[1]);
		
		String[] ns = nums.split(" ");
		
		for (int i = 0; i < n; ++i) {
			int num =  Integer.parseInt(ns[i]);
			if (num < x) {
				bw.write(num + " ");
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}