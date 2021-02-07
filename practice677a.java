import java.io.*;
import java.util.*;

public class practice677a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int width = 0;
		for (int i = 0; i < n; i++) {
			if (Integer.parseInt(st.nextToken()) > h) {
				width+=2;
			} else {
				width++;
			}
		}
		
		out.println(width);
		out.close();
	}
}


