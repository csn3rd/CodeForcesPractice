import java.io.*;
import java.util.*;

public class practice723a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int min = Integer.MAX_VALUE;
		
		min = Math.min(min, Math.abs(b-a)+Math.abs(c-a));
		min = Math.min(min, Math.abs(b-a)+Math.abs(c-b));
		min = Math.min(min, Math.abs(b-c)+Math.abs(c-a));
		
		out.println(min);
		out.close();
	}
}


