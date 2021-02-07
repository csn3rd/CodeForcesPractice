import java.io.*;
import java.util.*;

public class practice233b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		long n = Long.parseLong(st.nextToken());
		
		
		long ans = -1;
		for (int i = 0; i <= 90; i++) {
			long x = (-1*i + (long)Math.sqrt(i*i+4*n))/2;
			if (sum(x) == i && x*x+i*x==n) {
				ans = x;
			}
		}
		
		out.println(ans);
		out.close();
	}
	
	public static long sum(long n) {
		long sum = 0;
		while(n > 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
}


