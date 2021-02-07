import java.io.*;
import java.util.*;

public class practice69a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(f.readLine());
			x += Integer.parseInt(st.nextToken());
			y += Integer.parseInt(st.nextToken());
			z += Integer.parseInt(st.nextToken());
		}

		if (x ==0 && y == 0 && z == 0) {
			out.println("YES");
		} else {
			out.println("NO");
		}
		out.close();
	}
}


