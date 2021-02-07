import java.io.*;
import java.util.*;

public class practice236b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[1000010];
		
		for (int i = 1; i < 1000010; i++) {
			for (int j = i; j < 1000010; j+=i) {
				arr[j]++;
			}
		}
		
		long ans = 0;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				for (int k = 1; k <= c; k++) {
					int product = i*j*k;
					ans += arr[product];
					ans %= 1073741824;
				}
			}
		}
		
		out.println(ans%1073741824);
		out.close();
	}
}


