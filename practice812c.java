import java.io.*;
import java.util.*;

public class practice812c {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		long left = 0;
		long right = n;
		
		long ans = 0;
		while (left <= right) {
			long mid = left + (right-left)/2;
			
			long[] test = new long[n];
			for (int i = 0; i < n; i++) {
				test[i] = arr[i] + (i+1)*mid;
			}
			
			Arrays.sort(test);
			
			long sum = 0;
			for (int i = 0; i < mid; i++) {
				sum += test[i];
			}
			
			if (sum <= S) {
				left = mid+1;
				ans = sum;
			} else {
				right = mid-1;
			}
			
		}
				
		out.println(right + " " + ans);
		out.close();
	}
}


