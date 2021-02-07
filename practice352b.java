import java.io.*;
import java.util.*;

public class practice352b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int[] buckets = new int[100005];
		int[] previous = new int[100005];
		Arrays.fill(previous, -1);
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			int curr = Integer.parseInt(st.nextToken());
			if (previous[curr] != -1) {
				if (buckets[curr] != 0 && t-previous[curr] != buckets[curr]) {
					buckets[curr] = Integer.MAX_VALUE;
				} else {
					buckets[curr] = t-previous[curr];
				}
			}
			previous[curr] = t;
		}
		
		
		int ans = 0;
		for (int i = 0; i < 100005; i++) {
			if (buckets[i] != Integer.MAX_VALUE && previous[i] != -1) {
				ans++;
			}
		}
		
		out.println(ans);
		
		for (int i = 0; i < 100005; i++) {
			if (buckets[i] != Integer.MAX_VALUE && previous[i] != -1) {
				out.println(i + " " + buckets[i]);
			}
		}
		
		out.close();
	}
}


