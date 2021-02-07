import java.io.*;
import java.util.*;

public class practice732a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int k = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		long count = 1;
		int n = k%10;
		
		while (k%10 != r && k%10 != 0) {
			k%=10;
			k+=n;
			count++;
		}
		
		out.println(count);
		out.close();
	}
}


