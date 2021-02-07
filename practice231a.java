import java.io.*;
import java.util.*;

public class practice231a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());

		int count = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(f.readLine());
			int curr = 0;
			curr += Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
			if (curr >= 2) {
				count++;
			}
		}
		
		out.println(count);
		out.close();
	}
}


