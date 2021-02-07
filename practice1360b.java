import java.io.*;
import java.util.*;

public class practice1360b {
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
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			int diff = Integer.MAX_VALUE;
			for (int i = 1; i < n; i++) {
				diff = Math.min(arr[i]-arr[i-1], diff);
			}
			out.println(diff);
		}

		out.close();
	}
}


