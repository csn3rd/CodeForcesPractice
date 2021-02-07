import java.io.*;
import java.util.*;

public class practice69e {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(f.readLine());
		}
		
		HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int i = 0; i < k; i++) {
			int c = counts.getOrDefault(arr[i], 0);
			if (c == 0) {
				ts.add(arr[i]);
			} else {
				ts.remove(arr[i]);
			}
			counts.put(arr[i], c+1);
		}
		
		for (int i = k; i <= n; i++) {
			if (ts.size() == 0) {
				out.println("Nothing");
			} else {
				out.println(ts.last());
			}
			int c = counts.getOrDefault(arr[i-k], 0);
			if (c == 2) {
				ts.add(arr[i-k]);
			} else {
				ts.remove(arr[i-k]);
			}
			counts.replace(arr[i-k], c-1);
			if (i < n) {
				c = counts.getOrDefault(arr[i], 0);
				if (c == 0) {
					ts.add(arr[i]);
				} else {
					ts.remove(arr[i]);
				}
				counts.put(arr[i], c+1);
			}
		}

		out.close();
	}
}


