import java.io.*;
import java.util.*;

public class practice342a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int[] counts = new int[10];
		for (int t = 0; t < n; t++) {
			counts[Integer.parseInt(st.nextToken())]++;
		}
		
		int count = 0;
		StringBuilder ans = new StringBuilder();
		int num = Math.min(Math.min(counts[1], counts[2]), counts[4]);
		for (int i = 0; i < num; i++) {
			ans.append("1 2 4\n");
		}
		counts[1] -= num;
		counts[2] -= num;
		counts[4] -= num;
		count += num;
		
		num = Math.min(Math.min(counts[1], counts[2]), counts[6]);
		for (int i = 0; i < num; i++) {
			ans.append("1 2 6\n");
			
		}
		counts[1] -= num;
		counts[2] -= num;
		counts[6] -= num;
		count += num;
		
		num = Math.min(Math.min(counts[1], counts[3]), counts[6]);
		for (int i = 0; i < num; i++) {
			ans.append("1 3 6\n");
		}
		counts[1] -= num;
		counts[3] -= num;
		counts[6] -= num;
		count += num;
		
		if (count != n/3) {
			out.println(-1);
		} else {
			out.print(ans.toString());
		}

		out.close();
	}
}


