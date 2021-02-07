import java.io.*;
import java.util.*;

public class practice144a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int minindex = 0;
		int maxindex = 0;
		
		st = new StringTokenizer(f.readLine());
		for (int i = 0; i < n; i++) {
			int current = Integer.parseInt(st.nextToken());
			if (current <= min) {
				min = current;
				minindex = i;
			}
			if (current > max) {
				max = current;
				maxindex = i;
			}
		}

		if (minindex < maxindex) {
			out.println(maxindex + n - minindex - 2);
		} else {
			out.println(maxindex + n - minindex -1);
		}
		out.close();
	}
}


