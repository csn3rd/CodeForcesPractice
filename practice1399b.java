import java.io.*;
import java.util.*;

public class practice1399b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int T = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(f.readLine());
			st = new StringTokenizer(f.readLine());
			int[] a = new int[n];
			int amin = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
				amin = Math.min(amin, a[i]);
			}
			
			st = new StringTokenizer(f.readLine());
			int[] b = new int[n];
			int bmin = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				b[i] = Integer.parseInt(st.nextToken());
				bmin = Math.min(bmin, b[i]);
			}
			
			long ans = 0;
			for (int i = 0; i < n; i++) {
				ans += Math.max(a[i] - amin, b[i] - bmin);
			}
			out.println(ans);
		}

		out.close();
	}
}


