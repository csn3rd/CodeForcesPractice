import java.io.*;
import java.util.*;

public class practice353a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		boolean hasdiff = false;
		int sumup = 0;
		int sumdown = 0;
		for (int t = 0; t < n; t++) {
			st = new StringTokenizer(f.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sumup += a;
			sumdown += b;
			
			if (a%2 != b%2) {
				hasdiff = true;
			}
		}
		
		if (sumup%2==0 && sumdown%2==0) {
			out.println(0);
		} else if (sumup%2==1 && sumdown%2==1 && hasdiff) {
			out.println(1);
		} else {
			out.println(-1);
		}

		out.close();
	}
}


