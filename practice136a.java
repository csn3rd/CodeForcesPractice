import java.io.*;
import java.util.*;

public class practice136a {
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
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(st.nextToken())-1] = i+1;
		}
		
		for (int i = 0; i < n; i++) {
			out.print(arr[i]);
			if (i < n-1) {
				out.print(" ");
			}
		}
		out.close();
	}
}


