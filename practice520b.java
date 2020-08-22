import java.io.*;
import java.util.*;

public class practice520b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		
		while (m > n) {
			if (m%2 == 0) {
				m /= 2;
				ans++;
			} else {
				m = (m+1)/2;
				ans+=2;
			}
		}
		
		out.println(ans+n-m);
		out.close();
	}
}


