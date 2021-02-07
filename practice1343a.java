import java.io.*;
import java.util.*;

public class practice1343a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int t = Integer.parseInt(f.readLine());
		double largest = Math.log(1000000000)/Math.log(2);
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(f.readLine());
			for (int j = 2; j < largest; j++) {			// sum of 2^0 + 2^1 + ... + 2^n = 2^(n+1) - 1
				int sum = ((int)Math.pow(2, j)-1);
				if (n%sum == 0) {
					out.println(n/sum);
					j = (int)Math.ceil(largest);
				}
			}
		}

		out.close();
	}
}


