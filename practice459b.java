import java.io.*;
import java.util.*;

public class practice459b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int max = 0;
		long maxc = 0;
		int min = Integer.MAX_VALUE;
		long minc = 0;
		for (int t = 0; t < n; t++) {
			int i = Integer.parseInt(st.nextToken());
			if (i > max) {
				max = i;
				maxc = 1;
			} else if (i == max) {
				maxc++;
			}
			if (i < min) {
				min = i;
				minc = 1;
			} else if (i == min) {
				minc++;
			}
		}
		
		if (min == max) {
			out.println(0 + " " + (long)n*(n-1)/2);
		} else {
			out.println((max-min) + " " + (maxc*minc));
		}
		out.close();
	}
}


