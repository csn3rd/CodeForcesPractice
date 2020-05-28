import java.io.*;
import java.util.*;

public class practice110a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		long n = Long.parseLong(st.nextToken());
		
		long count = 0;
		while (n > 0) {
			if (n % 10 == 4 || n % 10 == 7) {
				count++;
			}
			n/=10;
		}
		
		if (count == 4 || count == 7) {
			out.println("YES");
		} else  {
			out.println("NO");
		}
		out.close();
	}
}


