import java.io.*;
import java.util.*;

public class practice131a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		String t = s.toUpperCase();

		if (s.equals(t) || s.substring(1).equals(t.substring(1))) {
			if (Character.isUpperCase(s.charAt(0))) {
				out.println(s.toLowerCase());
			} else {
				out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase());
			}
		} else {
			out.println(s);
		}
		out.close();
	}
}


