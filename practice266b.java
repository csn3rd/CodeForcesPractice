import java.io.*;
import java.util.*;

public class practice266b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		String s = f.readLine();
		for (int i = 0; i < t; i++) {
			s = arrange(s);
		}
		
		out.println(s);
		out.close();
	}
	
	public static String arrange(String s) {
		String ans = "";
		int i;
		for (i = 0; i < s.length()-1; i++) {
			if (s.charAt(i)=='B' && s.charAt(i+1)=='G') {
				ans += "GB";
				i++;
			} else {
				ans += s.charAt(i);
			}
		}
		if (i < s.length()) {
			ans += s.charAt(i);
		}
		return ans;
	}
}


