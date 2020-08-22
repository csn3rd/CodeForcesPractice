import java.io.*;
import java.util.*;

public class practice1385b {
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
			ArrayList<Integer> arr = new ArrayList<Integer>();
			st = new StringTokenizer(f.readLine());
			for (int i = 0; i < 2*n; i++) {
				int num = Integer.parseInt(st.nextToken());
				if (!arr.contains(num)) {
					arr.add(num);
				}
			}
			for (int i = 0; i < n-1; i++) {
				out.print(arr.get(i) + " ");
			}
			out.println(arr.get(n-1));
		}
		
		out.close();
	}
}


