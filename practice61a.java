import java.io.*;
import java.util.*;

public class practice61a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		String a = f.readLine();
		String b = f.readLine();
		
		String c = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '1' && b.charAt(i) == '1') {
				c  += '0';
			} else if (a.charAt(i) == '1' || b.charAt(i) == '1') {
				c += '1';
			} else {
				c += '0';
			}
		}

		out.println(c);
		out.close();
	}
}


