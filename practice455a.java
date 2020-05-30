import java.io.*;
import java.util.*;

public class practice455a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());

		int[] bucket = new int[100001];
		st = new StringTokenizer(f.readLine());
		for (int i = 0; i < n; i++) {
			int curr = Integer.parseInt(st.nextToken());
			bucket[curr]++;
		}
		
		long[][] dp = new long[100001][2];
		for(int i=1; i<=100000; i++) {
			dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
			dp[i][1] = dp[i-1][0] + (long)bucket[i]*(long)i;
		}
		
		out.println(Math.max(dp[100000][0], dp[100000][1]));
		out.close();
	}
}


