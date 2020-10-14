import java.io.*;
import java.util.*;

public class practice34a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int[] heights = new int[2*n];
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			heights[t] = Integer.parseInt(st.nextToken());
			heights[t+n] = heights[t];
		}
		
		int index = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int diff = Math.abs(heights[i]-heights[i+1]);
			if (diff < min) {
				min = diff;
				index = i;
			}
		}
		
		out.println((index)+1 + " " + ((index+1)%n+1));

		out.close();
	}
}


