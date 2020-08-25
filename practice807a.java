import java.io.*;
import java.util.*;

public class practice807a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		boolean rated = false;
		boolean unrated = false;
		
		int previous = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(f.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if (b != a) {
				rated = true;
			}
			
			if (i > 0 && b > previous) {
				unrated = true;
			}
			previous = b;
		}
		
		if (rated) {
			out.println("rated");
		} else if (unrated) {
			out.println("unrated");
		} else {
			out.println("maybe");
		}

		out.close();
	}
}


