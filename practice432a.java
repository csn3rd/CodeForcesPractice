import java.io.*;
import java.util.*;

public class practice432a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			int curr = Integer.parseInt(st.nextToken());
			if (curr <= 5-k) {
				ans++;
			}
		}

		out.println(ans/3);
		out.close();
	}
}


