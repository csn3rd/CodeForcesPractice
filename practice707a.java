import java.io.*;
import java.util.*;

public class practice707a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean color = false;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(f.readLine());
			for (int j = 0; j < m; j++) {
				String curr = st.nextToken();
				if (!curr.equals("W") && !curr.equals("B") && !curr.equals("G")) {
					color = true;
					break;
				}
			}
		}
		
		if (color) {
			out.println("#Color");
		} else {
			out.println("#Black&White");
		}
		
		out.close();
	}
}


