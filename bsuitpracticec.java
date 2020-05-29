import java.io.*;
import java.util.*;

public class bsuitpracticec {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		long n = Long.parseLong(st.nextToken());
		
		long sum = 0;
		st = new StringTokenizer(f.readLine());
		for (int i = 0; i < n; i++) {
			sum += Long.parseLong(st.nextToken());
		}

		out.println(sum);
		out.close();
	}
}


