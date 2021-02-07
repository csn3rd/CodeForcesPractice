import java.io.*;
import java.util.*;

public class practice1294a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int T = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(f.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			if (a > b) {
				a = a^b;
				b = b^a;
				a = a^b;
			}
			if (b > c) {
				c = c^b;
				b = b^c;
				c = c^b;
				
			}
			if (a > b) {
				a = a^b;
				b = b^a;
				a = a^b;
			}
			
			n -= (2*c-b-a);
			if (n >= 0 && n % 3 == 0) {
				out.println("YES");
			} else {
				out.println("NO");
			}
		}

		out.close();
	}
}


