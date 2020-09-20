import java.io.*;
import java.util.*;

public class practice1419a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int T = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(f.readLine());
			String s = f.readLine();
			if (n%2 == 1) {
				boolean hasOdd = false;
				for (int i = 0; i < n; i+=2) {
					if ((int)(s.charAt(i)-'0')%2==1) {
						hasOdd = true;
						i = n;
					}
				}
				if (hasOdd) {
					out.println(1);
				} else {
					out.println(2);
				}
			} else {
				boolean hasEven = false;
				for (int i = 1; i < n; i+=2) {
					if ((int)(s.charAt(i)-'0')%2==0) {
						hasEven = true;
						i = n;
					}
				}
				if (hasEven) {
					out.println(2);
				} else {
					out.println(1);
				}
			}
		}

		out.close();
	}
}


