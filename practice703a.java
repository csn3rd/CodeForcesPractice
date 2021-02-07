import java.io.*;
import java.util.*;

public class practice703a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int m = 0;
		int c = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(f.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a > b) {
				m++;
			}
			if (b > a) {
				c++;
			}
		}

		if (m > c) {
			out.println("Mishka");
		} else if (c > m) {
			out.println("Chris");
		} else {
			out.println("Friendship is magic!^^");
		}

		out.close();
	}
}


