import java.io.*;
import java.util.*;

public class practice450b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		long x = Integer.parseInt(st.nextToken());
		long y = Integer.parseInt(st.nextToken());
		
		int n = Integer.parseInt(f.readLine())-1;
		
		long ans = 0;
		
		if (n%6 == 0) {
			ans = x;
		} else if (n%6 == 1) {
			ans = y;
		} else if (n%6 == 2) {
			ans = y-x;
		} else if (n%6 == 3) {
			ans = -x;
		} else if (n%6 == 4) {
			ans = -y;
		} else if (n%6 == 5) {
			ans = x-y;
		}

		if (ans < 0) {
			out.println((ans+1000000007*2)%1000000007);
		} else {
			out.println(ans%1000000007);
		}
		out.close();
	}
}


