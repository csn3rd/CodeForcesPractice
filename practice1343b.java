import java.io.*;
import java.util.*;

public class practice1343b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int t = Integer.parseInt(f.readLine());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(f.readLine());
			if (n%4 != 0) {
				out.println("NO");
			} else {
				out.println("YES");
				for (int j = 0; j < n/2; j++) {
					out.print(j*2+2 + " ");
				}
				for (int j = 0; j < n/2-1; j++) {
					out.print(j*2+1 + " ");
				}
				out.println(n+n/2-1);
			}
		}

		out.close();
	}
}


