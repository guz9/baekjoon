import java.util.*;
import java.io.*;

public class Main {
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1000001;
		int min = 1000001;
		
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			max = num > max ? num : max;
			min = num < min ? num : min;
		}
		
		System.out.printf("%d %d", min, max);
	}
}