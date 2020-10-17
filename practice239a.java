import java.io.*;
import java.util.*;

public class practice239a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int y = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		boolean has = false;
		
		for (int i = y+k-(y)%k; i <= n; i+=k) {
			out.print((i-y) + " ");
			has = true;
		}
		
		if (!has) {
			out.println(-1);
		}
		
		out.close();
	}
}


