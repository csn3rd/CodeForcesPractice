import java.io.*;
import java.util.*;

public class practice236a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		
		HashSet<Character> hs = new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		
		if (hs.size()%2 == 0) {
			out.println("CHAT WITH HER!");
		} else {
			out.println("IGNORE HIM!");
		}
		out.close();
	}
}


