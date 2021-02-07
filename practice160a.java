import java.io.*;
import java.util.*;

public class practice160a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int[] coins = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(st.nextToken());
			sum += coins[i];
		}
		
		Arrays.sort(coins);
		int j = n-1;
		int mine = 0;
		while (j >= 0 && mine <= sum-mine) {
			mine += coins[j];
			j--;
		}

		out.println(n-j-1);
		out.close();
	}
}


