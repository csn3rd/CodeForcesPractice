import java.io.*;
import java.util.*;

public class practice546a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		long k = Integer.parseInt(st.nextToken());
		long n = Integer.parseInt(st.nextToken());
		long w = Integer.parseInt(st.nextToken());
		
		long owe = k*w*(w+1)/2-n;
		if (owe > 0) {
			out.println(k*w*(w+1)/2-n);
		} else {
			out.println(0);
		}
		out.close();
	}
}


