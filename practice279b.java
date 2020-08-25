import java.io.*;
import java.util.*;

public class practice279b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		
		long[] sum = new long[n+1];
		for (int i = 0; i < n; i++) {
			sum[i+1] = sum[i] + Integer.parseInt(st.nextToken());
		}
//		out.println(Arrays.toString(sum));
		
		int i = 0;
		int j = 0;
		int ans = 0;
		while (j != n+1) {
			if (sum[j]-sum[i] <= t) {
				j++;
				ans = Math.max(ans, j-i-1);
			} else {
				i++;
			}
		}

		out.println(ans);
		out.close();
	}
}


