import java.io.*;
import java.util.*;

public class practice116a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int max = 0;
		int cap = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(f.readLine());
			cap -= Integer.parseInt(st.nextToken());
			cap += Integer.parseInt(st.nextToken());
			max = Math.max(cap, max);
		}

		out.println(max);
		out.close();
	}
}


