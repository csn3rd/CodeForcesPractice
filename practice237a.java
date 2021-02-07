import java.io.*;
import java.util.*;

public class practice237a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		
		st = new StringTokenizer(f.readLine());
		int previoush = Integer.parseInt(st.nextToken());
		int previousm = Integer.parseInt(st.nextToken());
		int streak = 1;
		for (int t = 1; t < n; t++) {
			st = new StringTokenizer(f.readLine());
			int currh = Integer.parseInt(st.nextToken());
			int currm = Integer.parseInt(st.nextToken());
			if (currh == previoush && currm == previousm) {
				streak++;
			} else {
				ans = Math.max(streak, ans);
				previoush = currh;
				previousm = currm;
				streak = 1;
			}
		}

		out.println(Math.max(ans, streak));
		out.close();
	}
}


