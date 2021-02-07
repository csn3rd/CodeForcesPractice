import java.io.*;
import java.util.*;

public class practice334a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < n; t++) {
			for (int i = 0; i < n/2; i++) {
				out.print((t + i*n +1) + " ");
			}
			for (int i = n/2; i < n; i++) {
				out.print((i*n+n-t) + " ");
			}
			out.println();
		}

		out.close();
	}
}


