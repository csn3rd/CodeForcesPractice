import java.io.*;
import java.util.*;

public class practice510a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((i % 2 == 0) || (i % 4 == 1 && j == m-1) || (i % 4 == 3 && j == 0)) {
					out.print("#");
				} else {
					out.print(".");
				}
			}
			out.println();
		}

		out.close();
	}
}


