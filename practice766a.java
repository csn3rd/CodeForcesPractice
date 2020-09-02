import java.io.*;
import java.util.*;

public class practice766a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String a = f.readLine();
		String b = f.readLine();
		
		if (a.equals(b)) {
			out.println(-1);
		} else {
			out.println(Math.max(a.length(), b.length()));
		}

		out.close();
	}
}


