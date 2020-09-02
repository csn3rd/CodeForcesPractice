import java.io.*;
import java.util.*;

public class practice764a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
		
		int count = 0;
		for (int i = 1; i <= z; i++) {
			if (i%n == 0 && i%m == 0) {
				count++;
			}
		}

		out.println(count);
		out.close();
	}
}


