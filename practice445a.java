import java.io.*;
import java.util.*;

public class practice445a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[][] grid = new boolean[n][m];
		for (int t = 0; t < n; t++) {
			String line = f.readLine();
			for (int i = 0; i < m; i++) {
				grid[t][i] = line.charAt(i)=='.';
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!grid[i][j]) {
					out.print('-');
				} else {
					if ((i+j)%2==0) {
						out.print('B');
					} else {
						out.print('W');
					}
				}
			}
			out.println();
		}

		out.close();
	}
}


