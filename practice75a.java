import java.io.*;
import java.util.*;

public class practice75a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String a = f.readLine();
		String b = f.readLine();
		int sum = Integer.parseInt(a) + Integer.parseInt(b);
		
		String newa = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != '0') {
				newa += a.charAt(i);
			}
		}
		
		String newb = "";
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) != '0') {
				newb += b.charAt(i);
			}
		}
		
		String newsum = "";
		String s = sum + "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '0') {
				newsum += s.charAt(i);
			}
		}
		
		if (Integer.parseInt(newsum) == Integer.parseInt(newa) + Integer.parseInt(newb)) {
			out.println("YES");
		} else {
			out.println("NO");
		}
		
		out.close();
	}
}


