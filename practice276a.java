import java.io.*;
import java.util.*;

public class practice276a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		
		int max = Integer.MIN_VALUE;
		for (int t = 0; t < n; t++) {
			st = new StringTokenizer(f.readLine());
			int fi = Integer.parseInt(st.nextToken());
			int ti = Integer.parseInt(st.nextToken());
			
			if (ti > k) {
				fi -= (ti-k);
			}
			max = Math.max(fi, max);
		}

		out.println(max);
		out.close();
	}
}


