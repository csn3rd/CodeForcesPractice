import java.io.*;
import java.util.*;

public class practice222a {
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
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			arr[t] = Integer.parseInt(st.nextToken());
		}
		
		int previous = arr[n-1];
		for (int i = n-2; i >= 0; i--) {
			if (i >= (k-1) && arr[i] != previous) {
				out.println(-1);
				previous = -1000;
				break;
			} else if (arr[i] != previous) {
				out.println(i+1);
				previous = -1000;
				break;
			}
		}
		
		if (previous > 0) {
			out.println(0);
		}

		out.close();
	}
}


