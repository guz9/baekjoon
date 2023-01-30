import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		String s = "";
		int a = 0;
		int b = 0;
		
		while ((s = br.readLine()) != null) {
			a = Integer.parseInt(s.split(" ")[0]);
			b = Integer.parseInt(s.split(" ")[1]);
		
			bw.write((a + b) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}