import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine()); // 과목의 개수
		
		int[] score = new int[num]; // 최종 점수를 담는 배열
		String[] result = new String[num]; // OX결과를 입력받는 배열
		
		for (int i = 0 ; i < num; ++i) {
			result[i] = br.readLine(); // OX 결과 입력받기 
			int sum = 0; // 최종 점수

			for (int j = 0; j < result[i].length(); ++j) {
				char a = result[i].charAt(j); // 한글자씩 보기
			
				if (a == 'O') {
					sum++;
				}else if (a == 'X') {
					sum = 0;
				}
				score[i] += sum;
			}
		}
		
		for (int i = 0; i < num; ++i) {
			System.out.println(score[i]);
		}
	
	}
}