import java.io.*;
import java.util.*;

public class practice509a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int n = Integer.parseInt(f.readLine());

		int[] row = new int[n];
		Arrays.fill(row, 1);
		
		for (int i = 0; i< n-1; i++) {
			for (int j = 1; j < n; j++) {
				row[j] += row[j-1];
			}
		}
		
		out.println(row[n-1]);
		out.close();
	}
}


