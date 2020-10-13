import java.io.*;
import java.util.*;

public class practice275a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int[][] switched = new int[3][3];
		StringTokenizer st;
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(f.readLine());
			for (int j = 0; j < 3; j++) {
				switched[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int sum = 0;
				for (int k = Math.max(0, i-1); k < Math.min(3, i+2); k++) {
					sum += switched[k][j];
				}
				for (int k = Math.max(0, j-1); k < Math.min(3, j+2); k++) {
					sum += switched[i][k];
				}
				sum -= switched[i][j];
				if (sum%2==0) {
					out.print(1);
				} else {
					out.print(0);
				}
			}
			out.println();
		}

		out.close();
	}
}


