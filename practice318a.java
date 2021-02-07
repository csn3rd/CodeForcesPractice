import java.io.*;
import java.util.*;

public class practice318a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		long n = Long.parseLong(st.nextToken());
		long k = Long.parseLong(st.nextToken())-1;
		
		if (k*2 >= n) {
			out.println((k+1-(long)Math.ceil(n/2.0))*2);
		} else {
			out.println(k*2+1);
		}

		out.close();
	}
}


