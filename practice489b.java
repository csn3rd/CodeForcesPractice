import java.io.*;
import java.util.*;

public class practice489b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(f.readLine());
		int[] boys = new int[n];
		for (int i = 0; i < n; i++) {
			boys[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(f.readLine());
		
		st = new StringTokenizer(f.readLine());
		int[] girls = new int[m];
		for (int i = 0; i < m; i++) {
			girls[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(boys);
		Arrays.sort(girls);
		
		int b = 0;
		int g = 0;
		
		int ans = 0;
		while (b != n && g != m) {
			if (Math.abs(boys[b]-girls[g]) <= 1) {
				ans++;
				b++;
				g++;
			} else if (boys[b] < girls[g]) {
				b++;
			} else {
				g++;
			}
		}
		
		out.println(ans);
		out.close();
	}
}


