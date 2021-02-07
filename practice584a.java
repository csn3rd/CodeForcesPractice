import java.io.*;
import java.util.*;

public class practice584a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		String t = st.nextToken();
		
		if (t.length()>n) {
			out.println(-1);
		} else {
			for (int i = t.length(); i < n; i++) {
				t += "0";
			}
			out.println(t);
		}
		

		out.close();
	}
}


