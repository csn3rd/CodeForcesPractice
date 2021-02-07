import java.io.*;
import java.util.*;

public class practice139a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int[] pages = new int[7];
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < 7; t++) {
			pages[t] = Integer.parseInt(st.nextToken());
		}

		int index = 0;
		while (n > 0) {
			n -= pages[index%7];
			index++;
		}
		
		out.println((index-1)%7+1);
		out.close();
	}
}


