import java.io.*;
import java.util.*;

public class practice519d {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int[] value = new int[26];
		for (int i = 0; i < 26; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		String s = f.readLine();
		long psum = value[s.charAt(0)-'a'];
		TreeMap<c519d, Integer> tm = new TreeMap<c519d, Integer>();
		tm.put(new c519d(psum, s.charAt(0)), 1);
		
		long ans = 0;
		for (int i = 1; i < s.length(); i++) {
			
			c519d prev = new c519d(psum, s.charAt(i));
			if (i > 0) {
				ans += tm.getOrDefault(prev, 0);
			}

			psum += value[s.charAt(i)-'a'];
			c519d curr = new c519d(psum, s.charAt(i));
			tm.put(curr, tm.getOrDefault(curr, 0)+1);
		}
		
//		out.println(tm);
		
		out.println(ans);
		out.close();
	}
}

class c519d implements Comparable {
	long sum;
	char c;
	
	public c519d(long a, char b) {
		sum = a;
		c = b;
	}

	@Override
	public int compareTo(Object o) {
		if (sum == ((c519d)o).sum) {
			return c - ((c519d)o).c;
		} else if (sum > ((c519d)o).sum) {
			return 1;
		}
		return -1;
	}
	
	@Override
	public boolean equals(Object o) {
		return sum == ((c519d)o).sum && c == ((c519d)o).c;
	}
	
	@Override
	public String toString() {
		return sum + " " + c;
	}
}


