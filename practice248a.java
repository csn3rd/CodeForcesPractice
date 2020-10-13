import java.io.*;
import java.util.*;

public class practice248a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int l = 0;
		int r = 0;
		for (int t = 0; t < n; t++) {
			st = new StringTokenizer(f.readLine());
			l += Integer.parseInt(st.nextToken());
			r += Integer.parseInt(st.nextToken());
		}
		
		out.println(Math.min(n-l, l) + Math.min(n-r, r));
		out.close();
	}
}


