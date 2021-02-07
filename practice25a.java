import java.io.*;
import java.util.*;

public class practice25a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		
		int evenindex = 0;
		int oddindex = 0;
		int evencount = 0;
		for (int i = 0; i < n; i++) {
			if (Integer.parseInt(st.nextToken()) % 2 == 0) {
				evenindex = i;
				evencount++;
			} else {
				oddindex = i;
			}
		}
		
		if (evencount == 1) {
			out.println(evenindex+1);
		} else {
			out.println(oddindex+1);
		}
		out.close();
	}
}


