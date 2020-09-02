import java.io.*;
import java.util.*;

public class practice556a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		String s = f.readLine();
		
		int ones = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				ones++;
			}
		}
		
		out.println(Math.max(n-2*ones, 2*ones-n));

		out.close();
	}
}


