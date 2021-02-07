import java.io.*;
import java.util.*;

public class practice702b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int curr = Integer.parseInt(st.nextToken());
			hm.put(curr, hm.getOrDefault(curr, 0)+1);			
		}
		
		
		long pair = 0;
		for (Map.Entry<Integer, Integer> element : hm.entrySet()) {
			long i = 1;
			while (i <= Integer.MAX_VALUE) {
				if ((int)(i-element.getKey()) == element.getKey()) {
					pair += (long)(hm.get(element.getKey())-1)*hm.get(element.getKey());
				} else {
					pair += (long)hm.getOrDefault((int)(i-element.getKey()), 0)*hm.get(element.getKey());
				}
				i *= 2;
			}
		}

		out.println(pair/2);
		out.close();
	}
}


