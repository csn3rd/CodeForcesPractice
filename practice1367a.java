import java.io.*;
import java.util.*;

public class practice1367a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < n; t++) {
			String s = f.readLine();
			String ans = "";
			for (int i = 0; i < s.length()/2; i++) {
				ans += s.charAt(i*2);
			}
			ans += s.charAt(s.length()-1);
			out.println(ans);
		}

		out.close();
	}
}


