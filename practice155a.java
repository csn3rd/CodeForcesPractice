import java.io.*;
import java.util.*;

public class practice155a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int max = Integer.parseInt(st.nextToken());
		int min = max;
		int count = 0;
		for (int i = 1; i < n; i++) {
			int curr = Integer.parseInt(st.nextToken());
			if (curr > max) {
				count++;
				max = curr;
			}
			if (curr < min) {
				count++;
				min = curr;
			}
		}
		

		out.println(count);
		out.close();
	}
}


