import java.io.*;
import java.util.*;

public class practice680b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans = 0;
		for (int i = 1; i < Math.max(n-a+1, a); i++) {
			int possible = 0;
			int known = 0;
			if (a-i > 0) {
				possible++;
				known += arr[a-i-1];
			}
			if (a+i <= n) {
				possible++;
				known += arr[a+i-1];
			}
			if (known == possible) {
				ans+=known;
			}
		}
		ans += arr[a-1];
		
		out.println(ans);
		out.close();
	}
}


