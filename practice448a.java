import java.io.*;
import java.util.*;

public class practice448a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int a1 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		int a3 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int b1 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		int b3 = Integer.parseInt(st.nextToken());
		
		int n = Integer.parseInt(f.readLine());
		
		if (n >= Math.ceil((a1+a2+a3)/5.0) + Math.ceil((b1+b2+b3)/10.0)) {
			out.println("YES");
		} else {
			out.println("NO");
		}

		out.close();
	}
}


