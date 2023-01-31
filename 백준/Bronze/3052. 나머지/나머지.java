import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 42;
		HashSet<Integer> rest = new HashSet<Integer>();
		
		for (int i = 0; i < 10; ++i) {
			rest.add(Integer.parseInt(br.readLine()) % num);
		}
		System.out.println(rest.size());
	}
}