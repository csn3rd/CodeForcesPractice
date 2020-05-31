import java.io.*;
import java.util.*;

public class practice427a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		
		int ans = 0;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			int curr = Integer.parseInt(st.nextToken());
			if (curr < 0) {
				if (count == 0) {
					ans++;
				} else {
					count--;
				}
			} else {
				count += curr;
			}
		}
		
		out.println(ans);
		out.close();
	}
}


