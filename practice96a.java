import java.io.*;
import java.util.*;

public class practice96a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		
		if  (s.length() < 7) {
			out.println("NO");
			out.close();
			return;
		}
		
		boolean danger = false;
		char current = s.charAt(0);
		int count = 1;
		
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == current) {
				count++;
			} else {
				danger = danger || count >= 7;
				current = s.charAt(i);
				count = 1;
			}
		}
		
		if (danger || count >= 7) {
			out.println("YES");
		} else {
			out.println("NO");
		}
		
		out.close();
	}
}


