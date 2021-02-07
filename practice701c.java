import java.io.*;
import java.util.*;

public class practice701c {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		String flats = f.readLine();
		
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < n; i++) {
			hs.add(flats.charAt(i));
		}
		
		int size = hs.size();
		
		int start = 0;
		int ans = Integer.MAX_VALUE;
		
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		
		int unique = 0;
		for (int i = 0; i < n; i++) {
			int num = counts.getOrDefault(flats.charAt(i), 0);
			counts.put(flats.charAt(i), num+1);
			
			if (num == 0) {
				unique++;
			}
			
			if (unique == size) {
				int count = counts.get(flats.charAt(start));
				while (count > 1) {
					if (count > 1) {
						counts.replace(flats.charAt(start), count-1);
					}
					start++;
					count = counts.get(flats.charAt(start));
				}
				
				ans = Math.min(ans, i-start+1);				
			}
		}
		
		out.println(ans);
		out.close();
	}
}


