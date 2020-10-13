import java.io.*;
import java.util.*;

public class practice151a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int numfriends = Integer.parseInt(st.nextToken());
		int ml = Integer.parseInt(st.nextToken());
		ml *= Integer.parseInt(st.nextToken());
		int limeslice = Integer.parseInt(st.nextToken());
		limeslice *= Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int nl = Integer.parseInt(st.nextToken());
		int np = Integer.parseInt(st.nextToken());
	
		
		out.println(Math.min(limeslice, Math.min(p/np, ml/nl))/numfriends);

		out.close();
	}
}


