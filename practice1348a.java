import java.io.*;
import java.util.*;

public class practice1348a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int t = Integer.parseInt(st.nextToken());
		
		int[] mem = new int[31];
		mem[2] = 2;
		int max = 2;
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(f.readLine());
			int n = Integer.parseInt(st.nextToken());
			if (mem[n] > 0) {
				out.println(mem[n]);
			} else {
				for (int j = max; j <= n; j+=2) {
					mem[j] = mem[j-2]*2+2; 
				}
				max = n;
				out.println(mem[n]);
			}
		}

		out.close();
	}
}


