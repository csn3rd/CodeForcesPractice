import java.io.*;
import java.util.*;

public class practice580a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int[] arr = new int[n];
		for  (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		int current = 1;
		int previous = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= previous) {
				current++;
			} else {
				max = Math.max(max, current);
				current = 1;
			}
			previous = arr[i];
		}

		out.println(Math.max(max, current));
		out.close();
	}
}


