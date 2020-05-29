import java.io.*;
import java.util.*;

public class practice1030a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		boolean hard = false;
		for (int i = 0; i < n; i++) {
			hard = hard || Integer.parseInt(st.nextToken())==1;
		}
		if (hard) {
			out.println("HARD");
		} else {
			out.println("EASY");
		}
		out.close();
	}
}


