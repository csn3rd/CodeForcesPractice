import java.io.*;
import java.util.*;

public class practice545d {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int[] arr = new int[n];
		for (int t = 0; t < n; t++) {
			arr[t] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		long ans = 0;
		long sum = 0;
		for (int t = 0; t < n; t++) {
			if (arr[t] >= sum) {
				ans++;
				sum += arr[t];
			}
		}

		out.println(ans);
		out.close();
	}
}


