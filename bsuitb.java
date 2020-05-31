import java.io.*;
import java.util.*;

public class bsuitb {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		long l1 = Long.parseLong(st.nextToken());
		long r1 = Long.parseLong(st.nextToken());
		long l2 = Long.parseLong(st.nextToken());
		long r2 = Long.parseLong(st.nextToken());
		long k = Long.parseLong(st.nextToken());
		
		long ans = (long)Math.min(r1, r2)-(long)Math.max(l1, l2)+1;
		if (k <= (long)Math.min(r1, r2) && k >= (long)Math.max(l1, l2)) {
			ans--;
		}
		if (ans < 0) {
			out.println(0);
		} else {
			out.println(ans);
		}
		out.close();
	}
}


