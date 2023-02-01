import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine()); 
		
		double sum, avg, stuAvg, cnt;
		StringTokenizer st;
		
		for (int i = 0; i < c; ++i) {
			st = new StringTokenizer(br.readLine()," ");
			
			int stuNum = Integer.parseInt(st.nextToken());
			int[] score = new int[stuNum];
			
			cnt = 0; 
			sum = 0; 
			avg = 0; 
			stuAvg = 0;
			
			for (int j = 0; j < score.length; ++j) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			avg = sum / stuNum;
			
			for (int j = 0; j < stuNum; ++j) {
				if (score[j] > avg) {
					cnt++;
				}
			}
			stuAvg = (cnt / stuNum) * 100;
			System.out.printf("%.3f%%\n", stuAvg);
		}
	}
}