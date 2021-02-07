import java.io.*;
import java.util.*;

public class practice147a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		String ans = "";
		while(st.hasMoreTokens()) {
			String curr = st.nextToken();
			for (int i = 0; i < curr.length(); i++) {
				if (curr.charAt(i)!='.' && curr.charAt(i)!=',' && curr.charAt(i)!='!' && curr.charAt(i)!='?') {
					ans += curr.charAt(i);
				} else {
					if (ans.charAt(ans.length()-1) == ' ') {
						ans = ans.substring(0, ans.length()-1);
					}
					ans += curr.charAt(i);
					if (i != curr.length()-1) {
						ans += " ";
					}
				}
			}
			if (st.hasMoreTokens()) {
				ans += " ";
			}
		}

		out.println(ans);
		out.close();
	}
}


