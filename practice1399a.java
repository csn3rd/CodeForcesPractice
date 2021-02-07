import java.io.*;
import java.util.*;

public class practice1399a {
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
			boolean works = true;
			for (int i = 0; i < n-1; i++) {
				if (arr[i]+1 < arr[i+1]) {
					works = false;
					break;
				}
			}
			if (works) {
				out.println("YES");
			} else {
				out.println("NO");
			}
		}

		out.close();
	}
}


