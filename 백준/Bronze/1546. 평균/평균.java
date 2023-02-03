import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine()); // 과목의 개수
		double sum = 0; // 총합
		double max = -1; // 최고점
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < num; ++i) {
			int a = Integer.parseInt(st.nextToken());
			if (a > max) {
				max = a;
			}
			sum += a;
		}
		
		System.out.printf("%f", ((sum / max) * 100.0) / num);
	}
}