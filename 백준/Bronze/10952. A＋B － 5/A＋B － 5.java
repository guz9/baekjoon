import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		while (true) {
			String s = br.readLine();
			
			if (!s.equals("0 0")) {
				int a = Integer.parseInt(s.split(" ")[0]);
				int b = Integer.parseInt(s.split(" ")[1]);
			
				bw.write((a + b) + "\n");
			} else {
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}