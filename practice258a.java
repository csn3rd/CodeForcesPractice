import java.io.*;
import java.util.*;

public class practice258a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String n = f.readLine();
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == '0') {
				n = n.substring(0, i) + n.substring(i+1);
				out.println(n);
				out.close();
				return;
			}
		}

		out.println(n.substring(1));
		out.close();
	}
}


