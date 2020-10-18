import java.io.*;
import java.util.*;

public class practice315a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> bottles = new ArrayList<Integer>();
		ArrayList<Integer> opens = new ArrayList<Integer>();
		boolean[] openable = new boolean[n];
		for (int t = 0; t < n; t++) {
			st = new StringTokenizer(f.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			opens.add(b);
			bottles.add(a);
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && bottles.get(i).equals(opens.get(j))) {
					openable[i] = true;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (!openable[i]) {
				ans++;
			}
		}

		out.println(ans);
		out.close();
	}
}


