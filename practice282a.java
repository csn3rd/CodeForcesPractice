import java.io.*;
import java.util.*;

public class practice282a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(f.readLine());
		
		int x = 0;
		for (int i = 0; i < n; i++) {
			String s = (f.readLine());
			if (s.charAt(1)=='+') {
				x++;
			} else {
				x--;
			}
		}

		out.println(x);
		out.close();
	}
}


