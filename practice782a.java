import java.io.*;
import java.util.*;

public class practice782a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());

		int[] arr = new int[n+1];
		
		int ans = 0;
		int size = 0;
		for (int i = 0; i < 2*n; i++) {
			int curr = Integer.parseInt(st.nextToken());
			if (arr[curr] == 1) {
				size--;
				arr[curr] = 0;
			} else {
				arr[curr] = 1;
				size++;
			}
			ans = Math.max(ans, size);
		}

		
		out.println(ans);
		out.close();
	}
}


