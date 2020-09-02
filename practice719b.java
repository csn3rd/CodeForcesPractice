import java.io.*;
import java.util.*;

public class practice719b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		
		int last = Integer.parseInt(st.nextToken());
		int diff = 0;
		for (int i = 0; i < n-1; i++) {
			diff = Integer.parseInt(st.nextToken()) - last;
			last += diff;
 		}
		
		if (last == 15) {
			out.println("DOWN");
		} else if (last == 0) {
			out.println("UP");
		} else if (diff == 0) {
			out.println("-1");
		} else if (diff > 0) {
			out.println("UP");
		} else {
			out.println("DOWN");
		}

		out.close();
	}
}


