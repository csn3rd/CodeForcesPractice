import java.io.*;
import java.util.*;

public class practice486a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		long n = Long.parseLong(st.nextToken());

		if (n % 2 == 0) {
			out.println(n/2);
		} else {
			out.println("-" + (n / 2 + 1));
		}
		out.close();
	}
}


