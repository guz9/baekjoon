import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; ++i) {
			String[] str = br.readLine().split(" ");
			int t = Integer.parseInt(str[0]);
			
			for (int j = 0; j < str[1].length(); ++j) {
				for (int k = 0; k < t; ++k) {
					char ch = str[1].charAt(j);
					sb.append(ch);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}