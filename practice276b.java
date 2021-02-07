import java.io.*;
import java.util.*;

public class practice276b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		String s = f.readLine();
		int[] counts = new int[26];
		for (int t = 0; t < s.length(); t++) {
			counts[s.charAt(t)-'a']++;
		}

		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (counts[i]%2 == 1) {
				count++;
			}
		}
		
		if (count == 0 || count%2 == 1) {
			out.println("First");
		} else {
			out.println("Second");
		}
		out.close();
	}
}


