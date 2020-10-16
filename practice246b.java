import java.io.*;
import java.util.*;

public class practice246b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		if (sum%n == 0) {
			out.println(n);
		} else {
			out.println(n-1);
		}

		out.close();
	}
}


