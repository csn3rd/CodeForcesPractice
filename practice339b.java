import java.io.*;
import java.util.*;

public class practice339b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		long n = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		
		long time = 0;
		long current = 1;
		
		for (int i = 0; i < m; i++) {
			int dest = Integer.parseInt(st.nextToken());
			if (dest < current) {
				time += n-current+dest;
			} else {
				time += dest-current;
			}
			current = dest;
		}

		out.println(time);
		out.close();
	}
}


