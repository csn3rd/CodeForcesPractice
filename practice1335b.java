import java.io.*;
import java.util.*;

public class practice1335b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int T = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(f.readLine());
			int n = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			String s = "";
			for (int i = 0; i < n; i++) {
				s += (char)(i%b + 'a');
			}
			out.println(s);
		}

		out.close();
	}
}


