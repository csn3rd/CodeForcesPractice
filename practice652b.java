import java.io.*;
import java.util.*;

public class practice652b {
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
			arr[i] = Integer.parseInt(st.nextToken());
		}
 
		Arrays.sort(arr);
		
		int i = 0;
		int j = n-1;
		
		while(j >= i) {
			if (i != 0) {
				out.print(" ");
			}
			if (j != i) {
				out.print(arr[i] + " " + arr[j]);
			} else {
				out.print(arr[i]);
			}
			i++;
			j--;
		}
		
		out.close();
	}
}


