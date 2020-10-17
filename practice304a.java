import java.io.*;
import java.util.*;

public class practice304a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		for (long i = 1; i <= n; i++) {
			for (long j = i; j <= n; j++) {
				int k = (int)Math.sqrt(i*i+j*j) ;
				if (k > 0 && k <= n && Math.pow(k, 2) == i*i+j*j) {
					ans++;
				}
			}
		}

		out.println(ans);
		out.close();
	}
}


