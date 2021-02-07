import java.io.*;
import java.util.*;

public class practice1374b {
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
			
			int div2 = 0;
			while (n%2 == 0) {
				div2++;
				n/=2;
			}
			
			int div3 = 0;
			while (n%3 == 0) {
				div3++;
				n/=3;
			}
			
			if (n != 1 || div2 > div3) {
				out.println(-1);
			} else {
				out.println(2*div3-div2);
			}
		}

		out.close();
	}
}


