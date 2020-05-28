import java.io.*;
import java.util.*;

public class practice1a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		double n = Integer.parseInt(st.nextToken());
		double m = Integer.parseInt(st.nextToken());
		double a = Integer.parseInt(st.nextToken());
		
		out.println((long)Math.ceil(n/a)*(long)Math.ceil(m/a));
		out.close();
	}
}


