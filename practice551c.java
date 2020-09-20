import java.io.*;
import java.util.*;

public class practice551c {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		long left = 0;
		long right = Long.MAX_VALUE;
		
		while (left < right) {
			long mid = left + (right-left)/2;
			
			int[] test = Arrays.copyOf(arr, arr.length);
			
			int numleft = m;
			long time = mid;
			int index = 0;
			while(numleft > 0) {
				while (index < n && test[index] == 0) {
					index++;
				}
				time = mid-index-1;
				
				while (index < n && (test[index] == 0 || test[index] <= time)) {
					time -= (test[index]+1);
					index++;
				}
				
				if (index < n && test[index] > 0) {
					test[index] -= time;
				}
				
				numleft--;
			}
			
			if (index == n) {
				right = mid;
			} else {
				left = mid+1;
			}
		}
		
		out.println(left);
		out.close();
	}
}


