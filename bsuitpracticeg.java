import java.io.*;
import java.util.*;

public class bsuitpracticeg {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		long n = Long.parseLong(f.readLine());

		int m = (int) (n%s.length());
		long times = n/s.length();
		
		int acount = 0;
		int totalcount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='a') {
				if (i < m) {
					acount++;
				}
				totalcount++;
			}
		}
		
		out.println(totalcount*times+acount);
		out.close();
	}
}


