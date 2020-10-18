import java.io.*;
import java.util.*;

public class practice260a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		String a = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int works = -1;
		for (int i = 0; i < 10; i++) {
			if (Integer.parseInt(a+i)%b == 0) {
				works = i;
			}
		}
		
		if (works == -1) {
			out.println(-1);
		} else {
			out.print(a+works);
			for (int i = 1; i < n; i++) {
				out.print(0);
			}
			out.println();
		}

		out.close();
	}
}


