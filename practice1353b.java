import java.io.*;
import java.util.*;

public class practice1353b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int t = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(f.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[] a = new int[n];
			int[] b = new int[n];
			
			st = new StringTokenizer(f.readLine());
			for (int j = 0; j < n; j++) {
				a[j] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(f.readLine());
			for (int j = 0; j < n; j++) {
				b[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			for (int j = 0; j < k; j++) {
				if (a[j] < b[n-j-1]) {
					int temp = a[j];
					a[j] = b[n-j-1];
					b[n-j-1] = temp;
				}
			}
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += a[j];
			}
			
			out.println(sum);
		}

		out.close();
	}
}


