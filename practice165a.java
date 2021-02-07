import java.io.*;
import java.util.*;

public class practice165a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int[][] grid = new int[n][2];
		for (int t = 0; t < n; t++) {
			st = new StringTokenizer(f.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			grid[t][0] = x;
			grid[t][1] = y;
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			int left = 0;
			int right = 0;
			int up = 0;
			int down = 0;
			for (int j = 0; j < n; j++) {
				if (grid[i][0] > grid[j][0] && grid[i][1] == grid[j][1]) {
					right=1;
				} else if (grid[i][0] < grid[j][0] && grid[i][1] == grid[j][1]) {
					left = 1;
				} else if (grid[i][0] == grid[j][0] && grid[i][1] > grid[j][1]) {
					up = 1;
				} else if (grid[i][0] == grid[j][0] && grid[i][1] < grid[j][1]) {
					down = 1;
				}
			}
			if (right == 1 && left == 1 && up == 1 && down == 1) {
				ans++;
			}
		}
		
		out.println(ans);
		out.close();
	}
}


