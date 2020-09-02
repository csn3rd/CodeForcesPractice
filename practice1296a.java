import java.io.*;
import java.util.*;

public class practice1296a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int T = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(f.readLine());
			
			st = new StringTokenizer(f.readLine());
			
			int numodd = 0;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int curr = Integer.parseInt(st.nextToken());
				if (curr%2 == 1) {
					numodd++;
				}
				sum += curr;
			}
			
			if (sum%2 == 1 || (numodd > 0 && numodd != n)) {
				out.println("YES");
			} else {
				out.println("NO");
			}
			
		}

		out.close();
	}
}


