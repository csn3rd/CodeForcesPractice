import java.io.*;
import java.util.*;

public class bsuitpracticee {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		long n = Integer.parseInt(f.readLine());
		long m = Integer.parseInt(f.readLine());

		out.println(Math.min(n, m)*Math.min(n, m));
		out.close();
	}
}


