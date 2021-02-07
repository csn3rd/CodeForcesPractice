import java.io.*;
import java.util.*;

public class practice749a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		out.println(n/2);
		
		while(n > 3) {
			out.print(2 + " ");
			n-=2;
		}
		
		if (n == 3) {
			out.println(3);
		} else {
			out.println(2);
		}

		out.close();
	}
}


