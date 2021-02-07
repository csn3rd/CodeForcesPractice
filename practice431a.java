import java.io.*;
import java.util.*;

public class practice431a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int a1 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		int a3 = Integer.parseInt(st.nextToken());
		int a4 = Integer.parseInt(st.nextToken());
		
		String s = f.readLine();
		
		long ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				ans += a1;
			} else if (s.charAt(i) == '2') {
				ans += a2;
			} else if (s.charAt(i) == '3') {
				ans += a3;
			} else {
				ans += a4;
			}
		}
		
		out.println(ans);
		out.close();
	}
}


