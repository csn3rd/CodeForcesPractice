import java.io.*;
import java.util.*;

public class practice1367b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int T = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(f.readLine());
			st = new StringTokenizer(f.readLine());
			int ev = 0;
			int od = 0;
			for (int i = 0; i < n; i++) {
				int a = Integer.parseInt(st.nextToken());
				if (a%2 != i%2) {
					if (a%2 == 0) {
						ev++;
					} else {
						od++;
					}
				}
			}
			if (ev == od) {
				out.println(ev);
			} else {
				out.println(-1);
			}
		}
		
		out.close();
	}
}


