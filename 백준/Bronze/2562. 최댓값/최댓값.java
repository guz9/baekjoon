import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] nums = new int[9];
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < nums.length; ++i ) {
			nums[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, nums[i]);
			
			if (max == nums[i]) {
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
