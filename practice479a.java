import java.io.*;
import java.util.*;

public class practice479a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int a = Integer.parseInt(f.readLine());
		int b = Integer.parseInt(f.readLine());
		int c = Integer.parseInt(f.readLine());
		
		int max = Math.max(Math.max(Math.max(Math.max(0, a + b + c), a * (b + c)), (a + b) * c), a * b * c);

		out.println(max);
		out.close();
	}
}


