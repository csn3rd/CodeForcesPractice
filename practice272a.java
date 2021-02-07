import java.io.*;
import java.util.*;

public class practice272a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int sum = 0;
		for (int t = 0; t < n; t++) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		int ans = 0;
		for (int i = 1; i <= 5; i++) {
			if ((sum+i-1)%(n+1)!=0) {
				ans++;
			}
		}

		out.println(ans);
		out.close();
	}
}


