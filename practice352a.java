import java.io.*;
import java.util.*;

public class practice352a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int count = 0;
		for (int t = 0; t < n; t++) {
			if (Integer.parseInt(st.nextToken()) == 0) {
				count++;
			}
		}
		
		if ((n-count) >= 9 && (n-count)%9 == 0 && count > 0) {
			for (int i = 0; i < n-count; i++) {
				out.print("5");
			}
			for (int i = 0; i < count; i++) {
				out.print("0");
			}
		} else if ((n-count) >= 9 && count > 0) {
			for (int i = 0; i < (n-count)/9; i++) {
				out.print("555555555");
			}
			for (int i = 0; i < count; i++) {
				out.print("0");
			}
		} else if (count > 0) {
			out.println("0");
		} else {
			out.println("-1");
		}

		out.close();
	}
}


