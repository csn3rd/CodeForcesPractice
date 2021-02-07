import java.io.*;
import java.util.*;

public class practice263a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(f.readLine());
			for (int j = 0; j < 5; j++) {
				int curr =  Integer.parseInt(st.nextToken());
				if (curr == 1) {
					out.println(Math.abs(2-i)+Math.abs(2-j));
					out.close();
					return;
				}
			}
		}

	}
}


