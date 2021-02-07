import java.io.*;
import java.util.*;

public class practice520a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		if (n < 26) {
			out.println("NO");
			out.close();
			return;
		}

		String s = f.readLine();
		
		HashSet<Character> hs = new HashSet<Character>();
		
		for (int i = 0; i < n; i++) {
			hs.add(Character.toLowerCase(s.charAt(i)));
		}
		
		if (hs.size() == 26) {
			out.println("YES");
		} else {
			out.println("NO");
		}
		out.close();
	}
}


