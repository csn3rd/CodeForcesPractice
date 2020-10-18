import java.io.*;
import java.util.*;

public class practice336a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int sum = Math.abs(x) + Math.abs(y);
		if (x >= 0 && y >= 0) {
			out.println(0 + " " + sum + " " + sum + " " + 0);
		} else if (x >= 0) {
			out.println(0 + " " + -sum + " " + sum + " " + 0);			
		} else if (y >= 0) {
			out.println(-sum + " " + 0 + " " + 0 + " " + sum);
		} else {
			out.println(-sum + " " + 0 + " " + 0 + " " + -sum);
		}
		out.close();
	}
}


