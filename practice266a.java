import java.io.*;
import java.util.*;

public class practice266a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		f.readLine();
		String s = f.readLine();
		
		char current = s.charAt(0);
		int count = 1;
		
		int ans = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == current) {
				count++;
			} else {
				ans += count-1;
				current = s.charAt(i);
				count = 1;
			}
		}
		
		ans += count-1;
		
		out.println(ans);		
		out.close();
	}
}


