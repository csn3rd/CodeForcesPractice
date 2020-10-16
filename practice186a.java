import java.io.*;
import java.util.*;

public class practice186a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		String t = f.readLine();
		
		if (s.length() == t.length()) {
			ArrayList<Character> swap = new ArrayList<Character>();
			ArrayList<Character> swap2 = new ArrayList<Character>();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != t.charAt(i)) {
					swap.add(s.charAt(i));
					swap2.add(t.charAt(i));
				}
			}
			Collections.sort(swap);
			Collections.sort(swap2);
			if (swap.size() == 2 && swap.equals(swap2)) {
				out.println("YES");
			} else {
				out.println("NO");
			}
		} else {
			out.println("NO");
		}

		out.close();
	}
}


