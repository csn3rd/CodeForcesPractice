import java.io.*;
import java.util.*;

public class practice579a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		String x = Integer.toBinaryString(Integer.parseInt(f.readLine()));
		int ans = 0;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == '1') {
				ans++;
			}
		}
		
		out.println(ans);
		out.close();
	}
}


