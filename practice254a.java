import java.io.*;
import java.util.*;

public class practice254a {
	public static void main(String[] args) throws Exception {
		
		BufferedReader f = new BufferedReader(new  FileReader (new  File("input.txt")));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
		StringTokenizer st = new StringTokenizer(f.readLine());

//		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		StringBuilder s = new StringBuilder();
		
		int[] last = new int[5010];
		Arrays.fill(last, -1);
		st = new StringTokenizer(f.readLine());
		int pairs = 0;
		for (int t = 0; t < 2*n; t++) {
			int curr = Integer.parseInt(st.nextToken());
			if (last[curr] != -1) {
				s.append(last[curr] + " " + (t+1) + "\n");
				last[curr] = -1;
				pairs++;
			} else {
				last[curr] = (t+1);
			}
		}
		
		if (pairs == n) {
			out.println(s);
		} else {
			out.println(-1);
		}

		out.close();
	}
}


