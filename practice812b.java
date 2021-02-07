import java.io.*;
import java.util.*;

public class practice812b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] left = new int[n];
		int[] right = new int[n];
		
		int last = 0;
		
		for (int i = 0; i < n; i++) {
			String row = f.readLine();
			left[n-i-1] = row.indexOf('1');
			right[n-i-1] = row.lastIndexOf('1');
		}
		
		for (int i = 0; i < n;i ++) {
			if (left[i] != -1) {
				last = i;
			}
		}
		
		int[][] dp = new int[n][2];
		if (right[0] != -1) {
			dp[0][0] = 2*right[0];
		}
		dp[0][1] = m+1;
		
		for (int i = 1; i < last; i++) {
			if (right[i] != -1) {
				dp[i][0] = 1+Math.min(dp[i-1][0]+2*right[i], dp[i-1][1]+m+1);
				dp[i][1] = 1+Math.min(dp[i-1][0]+m+1, dp[i-1][1]+2*(m+1-left[i]));
			} else {
				dp[i][0] = 1+dp[i-1][0];
				dp[i][1] = 1+dp[i-1][1];
			}
		}
		
		int answer = 0;
		if (last == 0) {
			answer = Math.max(0, right[0]);
		} else if (last != n) {
			answer = 1+Math.min(dp[last-1][0]+right[last], dp[last-1][1]+m+1-left[last]);
		} else {
			answer = 1+Math.min(dp[last-1][0]-left[last-1], dp[last-1][1]+m+1-right[last-1]);
		}
		
//		out.println(Arrays.toString(left));
//		out.println(Arrays.toString(right));
//		
//		for (int i = 0; i < n; i++) {
//			out.println(Arrays.toString(dp[i]));
//		}
		
		out.println(answer);
		out.close();
	}
}


