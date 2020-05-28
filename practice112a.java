import java.io.*;
import java.util.*;

public class practice112a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine().toLowerCase();
		String t = f.readLine().toLowerCase();

		if (s.compareTo(t) > 0) {
			out.println(1);
		} else if (s.compareTo(t) < 0) {
			out.println(-1);
		} else {
			out.println(0);
		}
		out.close();
	}
}


