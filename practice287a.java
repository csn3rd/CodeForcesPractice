import java.io.*;
import java.util.*;

public class practice287a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int[][] grid = new int[4][4];
		for (int i = 0; i < 4; i++) {
			String s = f.readLine();
			for (int j = 0; j < 4; j++) {
				grid[i][j] = s.charAt(j)=='.' ? 1 : 0;
			}
		}
		
		boolean works = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int count = grid[i][j]+grid[i][j+1]+grid[i+1][j]+grid[i+1][j+1];
				if (count != 2) {
					works = true;
				}
			}
		}

		if (works) {
			out.println("YES");
		} else {
			out.println("NO");
		}
		out.close();
	}
}


