import java.io.*;
import java.util.*;

public class practice43b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		String s2 = f.readLine();
		int[] arr = new int[128];
		
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			String curr = st.nextToken();
			for (int i = 0; i < curr.length(); i++) {
				arr[curr.charAt(i)]++;
			}
		}
		
		st = new StringTokenizer(s2);
		while (st.hasMoreTokens()) {
			String curr = st.nextToken();
			for (int i = 0; i < curr.length(); i++) {
				if (arr[curr.charAt(i)] == 0) {
					out.println("NO");
					out.close();
					return;
				}
				arr[curr.charAt(i)]--;
			}
		}
		
		out.println("YES");
		out.close();
	}
}


