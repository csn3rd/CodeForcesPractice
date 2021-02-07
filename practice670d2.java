import java.io.*;
import java.util.*;

public class practice670d2 {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());		
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(f.readLine());		
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		
		long left = 0;
		long right = Long.MAX_VALUE;
		long mid = right;
		while (left < right && mid != right-1) {
			mid = left + (right-left)/2;
			
			int test = k;
			
			boolean works = true;
			
			for (int i = 0; i < n; i++) {
				if (b[i]+test < a[i] || (b[i]+test)/a[i] < mid) {
					works = false;
					i = n;
				} else if (b[i] < mid*a[i]) {
					test -= (mid*a[i]-b[i]);
				}
			}

			if (!works) {
				right = mid;
			} else {
				left = mid;
			}
			
		}
		
		out.println(left);
		out.close();
	}
}


