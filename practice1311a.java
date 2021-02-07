import java.io.*;
import java.util.*;

public class practice1311a {
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
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int diff = b-a;
			if (diff == 0) {
				out.println(0);
			} else if (diff > 0 && diff%2 == 1) {
				out.println(1);
			} else if (diff > 0) {
				out.println(2);
			} else if (diff%2 == 0) {
				out.println(1);
			} else {
				out.println(2);
			}
		}

		out.close();
	}
}


