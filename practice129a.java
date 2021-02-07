import java.io.*;
import java.util.*;

public class practice129a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int odd = 0;
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			int curr = Integer.parseInt(st.nextToken());
			sum += curr;
			odd += curr%2;
		}
		
		if (sum%2 == 0) {
			out.println(n-odd);
		} else {
			out.println(odd);
		}

		out.close();
	}
}


