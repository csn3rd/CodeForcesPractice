import java.io.*;
import java.util.*;

public class practice160b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		String s = f.readLine();
		char[] a = s.substring(0,n).toCharArray();
		char[] b = s.substring(n).toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean increasing = true;
		boolean decreasing = true;		
		for (int i = 0; i < n; i++) {
			if (a[i] <= b[i]) {
				increasing = false;
			}
			if (a[i] >= b[i]) {
				decreasing = false;
			}
		}
		
		if (increasing || decreasing) {
			out.println("YES");
		} else {
			out.println("NO");
		}

		out.close();
	}
}


