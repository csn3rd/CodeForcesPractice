import java.io.*;
import java.util.*;

public class practice618b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		boolean found = false;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(f.readLine());
			int max = 0;
			for (int j = 0; j < n; j++) {
				max = Math.max(max, Integer.parseInt(st.nextToken()));
			}
			if (max == n-1 && !found) {
				found = true;
				out.print(max+1);
			} else {
				out.print(max);
			}
			if (i < n-1) {
				out.print(" ");
			}
		}

		out.println();
		out.close();
	}
}


