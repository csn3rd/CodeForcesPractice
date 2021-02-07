import java.io.*;
import java.util.*;

public class practice68b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		double left = 0;
		double right = arr[n-1]+1;
		int count = 0;
		while (left < right && count < 35) {
			count++;
			double mid = left + (right-left)/2;
			
			double x = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] <= mid) {
					x -= (mid - arr[i]);
				} else {
					x += (arr[i]-mid)*(100-k)/100.00;
				}
			}
						
			if (x < 0) {
				right = mid;
			} else {
				left = mid+0.0000000001;
			}
		}

		out.println(left);
		out.close();
	}
}


