import java.io.*;
import java.util.*;

public class practice58a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		String s = f.readLine();
		String m = "hello";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (count < m.length() && s.charAt(i)==m.charAt(count)) {
				count++;
			}
		}
		
		if (count==5) {
			out.println("YES");
		} else {
			out.println("NO");
		}
		out.close();
	}
}


