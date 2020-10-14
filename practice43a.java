import java.io.*;
import java.util.*;

public class practice43a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int t = 0; t < n; t++) {
			String s = f.readLine();
			hm.put(s, hm.getOrDefault(s, 0)+1);
		}
		
		String winner = "";
		int count = 0;
		for (String key : hm.keySet()) {
			if (hm.get(key) > count) {
				winner = key;
				count = hm.get(key);
			}
		}
		
		out.println(winner);
		out.close();
	}
}


