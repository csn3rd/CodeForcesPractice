import java.io.*;
import java.util.*;

public class practice32b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		String st = f.readLine();
		
		String ans = "";
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == '.') {
				ans += "0";
				i--;
			} else if (st.charAt(i+1) == '.') {
				ans += "1";
			} else {
				ans += "2";
			}
			i++;
		}
		
		out.println(ans);
		out.close();
	}
}


