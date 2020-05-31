import java.io.*;
import java.util.*;

public class practice1097a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		String s = st.nextToken();
		char rank = s.charAt(0);
		char suit = s.charAt(1);
		
		st = new StringTokenizer(f.readLine());
		boolean play = false;
		for (int i = 0; i < 5 && !play; i++) {
			String curr = st.nextToken();
			if (curr.charAt(0) == rank) {
				play = true;
			}
			if (curr.charAt(1) == suit) {
				play = true;
			}
		}

		if (play) {
			out.println("YES");
		} else {
			out.println("NO");
		}

		out.close();
	}
}


