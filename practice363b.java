import java.io.*;
import java.util.*;

public class practice363b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());		
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int index = 0;
		
		int[] arr = new int[n];
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			arr[t] = Integer.parseInt(st.nextToken());
			sum += arr[t];
			if (t >= k-1) {
				if (sum < min) {
					min = sum;
					index = t-k+2;
				}
				sum -= arr[t-k+1];
			}
		}
		
		out.println(index);
		out.close();
	}
}


