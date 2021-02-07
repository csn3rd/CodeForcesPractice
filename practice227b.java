import java.io.*;
import java.util.*;

public class practice227b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());

		int[] buckets = new int[n+1];
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			buckets[Integer.parseInt(st.nextToken())] = t+1;
		}
		
		int m = Integer.parseInt(f.readLine());
		st = new StringTokenizer(f.readLine());
		long v = 0; long p = 0;
		for (int t = 0; t < m; t++) {
			int q = Integer.parseInt(st.nextToken());
			v += buckets[q];
			p += n-buckets[q]+1;
		}
		out.println(v + " " + p);
		out.close();
	}
}


