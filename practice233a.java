import java.io.*;
import java.util.*;

public class practice233a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		if (n%2 == 1) {
			out.println("-1");
		} else {
			for (int i = 2; i <= n; i+= 2) {
				out.print(i + " " + (i-1) + " ");
			}
		}
		out.println();
		out.close();
	}
}


