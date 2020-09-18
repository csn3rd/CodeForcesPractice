import java.io.*;
import java.util.*;

public class practice165b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		long left = 0;
		long right = Integer.MAX_VALUE;
		
		while (left < right) {
			long mid = left + (right-left)/2;
			int pow = 0;
			long sum = 0;
			
			while (sum < n && mid/(long)Math.pow(k, pow) > 0) {
				sum += mid/(long)Math.pow(k, pow);
				pow++;
			}
			
			if (sum >= n) {
				right = mid;
			} else {
				left = mid+1;
			}
		}

		out.println(left);
		out.close();
	}
}


