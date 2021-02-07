import java.io.*;
import java.util.*;

public class practice230b {

	
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		for (int i = 0; i < n; i++) {
			long current = Long.parseLong(st.nextToken());
			long root = (long)Math.sqrt(current);
			if (root*root == current && isprime(root)) {
				out.println("YES");
			} else {
				out.println("NO");
			}
		}
		
		out.close();
	}
	
	public static boolean isprime(long n) {
		if (n <= 1) 
			return false; 
		
		if (n <= 3) 
			return true; 

		if (n % 2 == 0 || n % 3 == 0) 
			return false; 

		for (long i = 5; i * i <= n; i = i + 6) 
			if (n % i == 0 || n % (i + 2) == 0) 
				return false; 

		return true; 
	}
	
}


