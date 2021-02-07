import java.io.*;
import java.util.*;

public class practice133a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		
		if (s.contains("H") || s.contains("Q") || s.contains("9")) {
			out.println("YES");
		} else {
			out.println("NO");
		}

		out.close();
	}
}


