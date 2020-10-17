import java.io.*;
import java.util.*;

public class practice253a {
	public static void main(String[] args) throws Exception {
		
		BufferedReader f = new BufferedReader(new  FileReader (new  File("input.txt")));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
		StringTokenizer st = new StringTokenizer(f.readLine());

//		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < Math.min(n, m); t++) {
			if (n > m) {
				out.print("BG");
			} else {
				out.print("GB");
			}
		}
		for (int t = 0; t < Math.max(n, m)-Math.min(n, m); t++) {
			if (n > m) {
				out.print("B");
			} else {
				out.print("G");
			}
		}

		out.close();
	}
}


