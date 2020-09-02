import java.io.*;
import java.util.*;

public class practice813b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		long x = Long.parseLong(st.nextToken());
		long y = Long.parseLong(st.nextToken());
		long l = Long.parseLong(st.nextToken());
		long r = Long.parseLong(st.nextToken());
		
		
		ArrayList<Long> add = new ArrayList<Long>();
		for (long i = 1; i <= r; i = trymult(i, x)) {
			for (long j = 1; i+j <= r; j =trymult(j, y)) {
				if (i+j >= l) {
					add.add(i+j);
				}
			}
		}
		
		add.add(l-1);
		add.add(r+1);
		Collections.sort(add);
		
		long ans = 0;
		long prev = l;
		for (int i = 0; i < add.size(); i++) {
			ans = Math.max(ans, add.get(i)-prev-1);
			prev = add.get(i);
		}

		out.println(ans);
		out.close();
	}


	public static long trymult (long a, long b) {
		long largest = (long)1e18 + 1;
		if(a > largest / b) {
			return largest;
		}
		return a * b;
    }
}


