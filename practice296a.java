import java.io.*;
import java.util.*;

public class practice296a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int[] buckets = new int[1010];
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			buckets[Integer.parseInt(st.nextToken())]++;
		}
		
		for (int i = 0; i < 1010; i++) {
			if (buckets[i] > (n+1)/2) {
				out.println("NO");
				out.close();
				return;
			}
		}

		out.println("YES");
		out.close();
	}
}


