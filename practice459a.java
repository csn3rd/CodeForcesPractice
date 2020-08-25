import java.io.*;
import java.util.*;

public class practice459a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
		if (x1 == x2 && y1 == y2) {
			out.println(-1);
		} else if (x1 == x2) {
			int diff = Math.abs(y2-y1);
			if (x1+diff <= 1000) {
				out.println((x1+diff) + " " + y2 + " " + (x1+diff) + " " + y1);
			} else if (x1-diff >= -1000) {
				out.println((x1-diff) + " " + y2 + " " + (x1-diff) + " " + y1);				
			} else {
				out.println(-1);
			}
		} else if (y1 == y2) {
			int diff = Math.abs(x2-x1);
			if (y1+diff <= 1000) {
				out.println(x1 + " " + (y1+diff) + " " + x2 + " " + (y1+diff));
			} else if (y1-diff >= -1000) {
				out.println(x1 + " " + (y1-diff) + " " + x2 + " " + (y1-diff));				
			} else {
				out.println(-1);
			}			
		} else {
			if (Math.abs(x2-x1) == Math.abs(y2-y1)) {
				out.println(x1 + " " + y2 + " " + x2 + " " + y1);
			} else {
				out.println(-1);
			}
		}

		out.close();
	}
}


