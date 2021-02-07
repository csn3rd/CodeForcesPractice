import java.io.*;
import java.util.*;

public class practice320a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		String s = f.readLine();
		
		boolean magic = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, Math.min(i+3, s.length())).equals("144")) {
				i += 2;
			} else if (s.substring(i, Math.min(i+2, s.length())).equals("14")) {
				i++;
			} else if (s.substring(i, i+1).equals("1")) {
				// good
			} else {
				magic = false;
			}
		}
		
		if (magic) {
			out.println("YES");
		} else {
			out.println("NO");
		}
		out.close();
	}
}


