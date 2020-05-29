import java.io.*;
import java.util.*;

public class practice785a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			char c = f.readLine().charAt(0);
			if (c == 'T')
				count += 4;
			if (c == 'C')
				count += 6;
			if (c == 'O')
				count += 8;
			if (c == 'D')
				count += 12;
			if (c == 'I')
				count += 20;
		}

		out.println(count);
		out.close();
	}
}


