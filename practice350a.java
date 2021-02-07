import java.io.*;
import java.util.*;

public class practice350a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int minaccept = Integer.MAX_VALUE;
		int maxaccept = Integer.MIN_VALUE;
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			int curr = Integer.parseInt(st.nextToken());
			minaccept = Math.min(minaccept, curr);
			maxaccept = Math.max(maxaccept, curr);
		}
		
		int minwrong = Integer.MAX_VALUE;
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < m; t++) {
			minwrong = Math.min(minwrong, Integer.parseInt(st.nextToken()));
		}
		
		if (minwrong <= Math.max(minaccept*2, maxaccept)) {
			out.println(-1);
		} else {
			out.println(Math.max(minaccept*2, maxaccept));
		}

		out.close();
	}
}


