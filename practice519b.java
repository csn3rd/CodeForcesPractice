import java.io.*;
import java.util.*;

public class practice519b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		long sum1 = 0;
		long sum2 = 0;
		long sum3 = 0;
		
		st = new StringTokenizer(f.readLine());
		for (int i = 0; i < n; i++) {
			sum1 += Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(f.readLine());
		for (int i = 0; i < n-1; i++) {
			sum2 += Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(f.readLine());
		for (int i = 0; i < n-2; i++) {
			sum3 += Integer.parseInt(st.nextToken());
		}
		
		out.println(sum1-sum2);
		out.println(sum2-sum3);
		out.close();
	}
}


