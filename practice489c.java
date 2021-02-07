import java.io.*;
import java.util.*;

public class practice489c {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());

		if ((s == 0 && m > 1) || s > m*9) {
			out.println("-1 -1");
			out.close();
			return;
		}
		
		int[] min = new int[m];
		int[] max = new int[m];
		
		int ss = s-1;
		for (int i = m-1; i >= 0; i--) {
			if (ss > 9) {
				min[i] = 9;
				ss -= 9;
			} else {
				min[i] = ss;
				break;
			}
		}
		min[0]++;
		
		for (int i = 0; i < m; i++) {
			if (s >= 9) {
				max[i] = 9;
				s -= 9;
			} else {
				max[i] =s;
				break;
			}
		}
		
		for (int i = 0; i < m; i++) {
			out.print(min[i]);
		}
		out.print(" ");
		for (int i = 0; i < m; i++) {
			out.print(max[i]);
		}
		out.println();
		
		out.close();
	}
}


