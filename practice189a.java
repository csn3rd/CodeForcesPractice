import java.io.*;
import java.util.*;

public class practice189a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[n+1];
		dp[0] = 0;

		for (int i = 1; i <= n; i++) {
			int x = -1, y = -1, z = -1;
			
			if (a <= i) {
				x = dp[i-a];
			}
			
			if (b <= i) {
				y = dp[i-b];
			}
			
			if (c <= i) {
				z = dp[i-c];
			}
			
			dp[i] = (int)Math.max(Math.max(x, y), z);
			if (dp[i] > -1) {
				dp[i]++;
			}
		}
		out.println(dp[n]);
		out.close();
	}
}


