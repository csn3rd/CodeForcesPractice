import java.io.*;
import java.util.*;

public class bsuitd {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[n];
		long totalsum = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(f.readLine());
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			arr[i] = sum;
			totalsum += sum;
		}
		
		for (int i =  0; i < n; i++) {
			arr[i] *= (2*n-2);
			if (n > 2) {
				arr[i] -= totalsum;
				arr[i] /= ((long)2*n*n-(long)6*n+4);
			} else {
				arr[i] /= 4;
			}
		}
		
		for (int i = 0; i < n; i++) {
			out.print(arr[i] + " ");
		}
		out.close();
	}
}


