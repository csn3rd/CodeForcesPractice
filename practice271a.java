import java.io.*;
import java.util.*;

public class practice271a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		n++;
		
		while (!distinct(n)) {
			n++;
		}
		
		out.println(n);
		out.close();
	}
	
	public static boolean distinct (int n) {
		String s = ""+n;
		return s.charAt(0) != s.charAt(1) && s.charAt(0) != s.charAt(2) && s.charAt(0) != s.charAt(3) && s.charAt(1) != s.charAt(2) && s.charAt(1) != s.charAt(3) && s.charAt(2) != s.charAt(3);
	}
}


