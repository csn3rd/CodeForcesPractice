import java.io.*;
import java.util.*;

public class practice433a {
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
		int count = 0;
		for (int t = 0; t < n; t++) {
			int curr = Integer.parseInt(st.nextToken());
			sum += curr;
			if (curr == 100) {
				count++;
			}
		}
		
		if (sum%200 != 0) {
			out.println("NO");
		} else {
			boolean works = false;
			for (int i = 0; i <= n-count; i++) {
				if (200*i <= sum/2 && sum/2-200*i <= count*100) {
					works = true;
				}
			}
			if (works) {
				out.println("YES");
			} else {
				out.println("NO");
			}
		}

		out.close();
	}
}


