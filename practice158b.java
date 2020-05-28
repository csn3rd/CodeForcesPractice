import java.io.*;
import java.util.*;

public class practice158b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		long n = Integer.parseInt(st.nextToken());

		long[] arr = new long[4];
		
		st = new StringTokenizer(f.readLine());
		for(int i = 0; i < n; i++) {
			arr[Integer.parseInt(st.nextToken())-1]++;
		}
		
		long ans = arr[3] + arr[2] + arr[1] / 2 + (long)Math.ceil((Math.max(arr[0] - arr[2], 0) + 2*(arr[1] % 2))/4.0);
		
		out.println(ans);
		out.close();
	}
}


