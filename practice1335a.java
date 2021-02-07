import java.io.*;
import java.util.*;

public class practice1335a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int t = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(f.readLine());
			out.println((n - 1) / 2);
		}
		out.close();
	}
}


