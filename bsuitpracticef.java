import java.io.*;
import java.util.*;

public class bsuitpracticef {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		int a = s.charAt(0)-'A';
		int b = s.charAt(1)-'0';

		if ((a+b)%2 == 0) {
			out.println("WHITE");
		} else {
			out.println("BLACK");
		}
		out.close();
	}
}


