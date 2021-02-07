import java.io.*;
import java.util.*;

public class practice706b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int[] prices = new int[n];
		st = new StringTokenizer(f.readLine());
		
		for (int i = 0; i < n; i++) {
			prices[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(prices);

		int q = Integer.parseInt(f.readLine());
		
		for (int i = 0; i < q; i++) {
			int coins = Integer.parseInt(f.readLine());
			
			int l = 0;
			int r = n;
			while (r > l) {
				int mid = (l+r)/2;
				if (prices[mid] > coins) {
					r=mid;
				} else {
					l=mid+1;
				}
			}
			
			out.println(l);
			
		}
		
		out.close();
	}
}


