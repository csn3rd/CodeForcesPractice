import java.io.*;
import java.util.*;

public class practice327a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(f.readLine());
		int count = 0;
		for (int t = 0; t < n; t++) {
			arr[t] = Integer.parseInt(st.nextToken());
			count += arr[t];
		}
		
		int max = -1;
		for (int i = 0; i < n; i++) {
			int flip = 0;
			for (int j = 0; j < n-i; j++) {
				if (arr[i+j]==1) {
					flip -= 1;
				} else {
					flip += 1;
				}
				
				if (flip > max) {
					max = flip;
				}
			}
		}
		
		out.println(count+max);

		out.close();
	}
}


