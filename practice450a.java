import java.io.*;
import java.util.*;

public class practice450a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int max = 0;
		int index = 0;
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			int curr = (int)Math.ceil(Integer.parseInt(st.nextToken())/(double)m);
			if (curr >= max) {
				max = curr;
				index = t;
			}
		}
		
		out.println(index+1);
		out.close();
	}
}


