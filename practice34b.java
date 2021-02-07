import java.io.*;
import java.util.*;

public class practice34b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int[] prices = new int[n];
		for (int t = 0; t < n; t++) {
			prices[t] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(prices);
		
		int ans = 0;
		for (int i = 0; i < m && prices[i] < 0; i++) {
			ans += prices[i];
		}
		
		out.println(-1*ans);
		out.close();
	}
}


