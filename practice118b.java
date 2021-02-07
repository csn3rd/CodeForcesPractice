import java.io.*;
import java.util.*;

public class practice118b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2*(n-i); j++) {
				out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				out.print(j + " ");
			}
			out.print(i);
			for (int j = i-1; j >= 0; j--) {
				out.print(" " + j);
			}
			out.println();
		}
		
		for (int i = 0; i < n; i++) {
			out.print(i + " ");
		}
		out.print(n);
		for (int i = n-1; i >= 0; i--) {
			out.print(" " + i);
		}
		out.println();
		for (int i = n-1; i >= 0; i--) {
			for (int j = 0; j < 2*(n-i); j++) {
				out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				out.print(j + " ");
			}
			out.print(i);
			for (int j = i-1; j >= 0; j--) {
				out.print(" " + j);
			}
			out.println();
		}

		out.close();
	}
}


