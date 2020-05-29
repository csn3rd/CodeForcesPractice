import java.io.*;
import java.util.*;

public class practice148a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int k = Integer.parseInt(f.readLine());
		int l = Integer.parseInt(f.readLine());
		int m = Integer.parseInt(f.readLine());
		int n = Integer.parseInt(f.readLine());
		int d = Integer.parseInt(f.readLine());
		
		int count = 0;
		for (int i = 1; i <= d; i++) {
			if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
				count++;
			}
		}

		out.println(count);
		out.close();
	}
}


