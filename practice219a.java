import java.io.*;
import java.util.*;

public class practice219a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int k = Integer.parseInt(st.nextToken());
		String s = f.readLine();
		
		int[] counts = new int[26];
		for (int i = 0; i < s.length(); i++) {
			counts[s.charAt(i)-'a']++;
		}
		
		boolean works = true;
		for (int i = 0; i < 26; i++) {
			if (counts[i] % k != 0) {
				works = false;
			}
		}

		if (!works) {
			out.println(-1);
		} else {
			String ans = "";
			for (int i = 0; i < 26; i++) {
				for (int j = 0; j < counts[i]/k; j++) {
					ans += (char)(i+'a');
				}
			}
			for (int i = 0; i < k; i++) {
				out.print(ans);
			}
			out.println();
		}
		out.close();
	}
}


