import java.io.*;
import java.util.*;

public class practice344a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int groups = 0;
		String s = f.readLine();
		char start = s.charAt(0);
		for (int i = 1; i < n; i++) {
			s = f.readLine();
			if (start != s.charAt(0)) {
				groups++;
				start = s.charAt(0);
			}
		}

		out.println(groups+1);
		out.close();
	}
}


