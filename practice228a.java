import java.io.*;
import java.util.*;

public class practice228a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int count = 0;
		for (int i = 0; i < 4; i++) {
			boolean same = false;
			for (int j = i+1; j < 4; j++) {
				if (arr[i] == arr[j]) {
					same = true;
				}
			}
			if (same) {
				count++;
			}
		}
		
		out.println(count);
		out.close();
	}
}


