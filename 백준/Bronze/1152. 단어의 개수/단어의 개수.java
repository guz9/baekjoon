import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int len = str.length;
		
		if (str.length != 0 && str[0].equals("")) {
			len = str.length - 1;
		}
		
		System.out.println(len);
		
	}
}