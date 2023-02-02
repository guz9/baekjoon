public class Main {
	 
	public static int d(int num) {
		int sum = num;
		
		while (num != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i < 10001; ++i) {
			int n = d(i);
			if (n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < 10001; ++i) {
			if(check[i] == false) {
				sb.append(i + "\n");
			}
		}
		System.out.println(sb);
	}
}