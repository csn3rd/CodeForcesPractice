import java.io.*;
import java.util.*;

public class practice349a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int r25 = 0;
		int r50 = 0;
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			int curr = Integer.parseInt(st.nextToken());
			if (curr == 50 && r25 == 0) {
				out.println("NO");
				out.close();
				return;
			} else if (curr == 100 && !(r25 != 0 && r50 != 0 || r25 >= 3)) {
				out.println("NO");
				out.close();
				return;
			}
			
			if (curr == 25) {
				r25++;
			} else if (curr == 50) {
				r25--;
				r50++;
			} else if (curr == 100) {
				if (r50 == 0) {
					r25-=3;
				} else {
					r25--;
					r50--;
				}
			}
		}

		out.println("YES");
		out.close();
	}
}


