import java.io.*;
import java.util.*;

public class practice330a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[r][c];
		for (int row = 0; row < r; row++) {
			String line = f.readLine();
			for (int col = 0; col < c; col++) {
				arr[row][col] = line.charAt(col);
			}
		}
		
		
		for (int row = 0; row < r; row++) {
			boolean eat = true;
			for (int col = 0; col < c; col++) {
				eat = eat && (arr[row][col] != 'S');
			}
			if (eat) {
				for (int col = 0; col < c; col++) {
					arr[row][col] = 'e';
				}
			}
		}
		
		for (int col = 0; col < c; col++) {
			boolean eat = true;
			for (int row = 0; row < r; row++) {
				eat = eat && (arr[row][col] != 'S');
			}
			if (eat) {
				for (int row = 0; row < r; row++) {
					arr[row][col] = 'e';
				}
			}
		}
		
		int count = 0;
		for (int row = 0; row < r; row++) {
			for (int col = 0; col < c; col++) {
				if (arr[row][col] == 'e') {
					count++;
				}
			}
		}
		
//		for (int row = 0; row < r; row++) {
//			out.println(Arrays.toString(arr[row]));
//		}
		
		out.println(count);
		out.close();
	}
}


