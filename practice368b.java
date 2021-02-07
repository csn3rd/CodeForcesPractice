import java.io.*;
import java.util.*;

public class practice368b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			arr[t] = Integer.parseInt(st.nextToken());
		}
		
		int[] ans = new int[n];
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = n-1; i >= 0; i--) {
			hs.add(arr[i]);
			ans[i] = hs.size();
		}
		
		for (int i = 0; i < m; i++) {
			int l = Integer.parseInt(f.readLine());
			out.println(ans[l-1]);
		}

		out.close();
	}
}


