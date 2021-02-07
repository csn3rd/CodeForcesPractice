import java.io.*;
import java.util.*;

public class practice242b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int[][] segments = new int[n][2];
		int leftmost = Integer.MAX_VALUE;
		int rightmost = Integer.MIN_VALUE;
		for (int t = 0; t < n; t++) {
			st = new StringTokenizer(f.readLine());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			segments[t][0] = l;
			segments[t][1] = r;
			if (l < leftmost) {
				leftmost = l;
			}
			if (r > rightmost) {
				rightmost = r;
			}
		}
		
		int index = 0;
		for (int t = 0; t < n; t++) {
			if (segments[t][0] == leftmost && segments[t][1] == rightmost) {
				out.println(t+1);
				out.close();
				return;
			}
		}
		
		out.println(-1);
		out.close();
	}
}


