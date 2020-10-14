import java.io.*;
import java.util.*;

public class practice149a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int k = Integer.parseInt(st.nextToken());
		
		int[] cm = new int[12];
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < 12; t++) {
			cm[t] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(cm);
		
		int i = 11;
		while (i >= 0 && k > 0) {
			k -= cm[i];
			i--;
		}
		if (k > 0) {
			out.println(-1);
		} else {
			out.println(11-i);
		}
		out.close();
	}
}


