import java.io.*;
import java.util.*;

public class practice80a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		
		int largest = 3;
		while (largest <= m) {
			largest++;
			boolean works = true;
			for (int p : primes) {
				if (largest%p==0) {
					works = false;
				}
			}
			if (works) {
				primes.add(largest);
			}
		}
		
		if (primes.get(primes.size()-1) == m && primes.get(primes.size()-2) == n) {
			out.println("YES");
		} else {
			out.println("NO");
		}

		out.close();
	}
}


