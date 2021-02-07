import java.io.*;
import java.util.*;

public class practice705a {
	static PrintWriter out;
	static int count = 0;
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		layer(n);

		out.close();
	}
	
	public static void layer (int n) {
		if (count % 2 == 1) {
			out.print("I love ");
		} else {
			out.print("I hate ");
		}
		count++;
		if (n == 1) {
			out.println("it");
			return;
		} else {
			out.print("that ");
		}
		layer(n-1);
	}
}


