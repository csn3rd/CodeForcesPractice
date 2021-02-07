import java.io.*;
import java.util.*;

public class practice637b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		Stack<String> s = new Stack<String>();
		
		for (int i = 0; i < n; i++) {
			String str = f.readLine();
			s.add(str);
			hm.put(str, 1);
		}
		
		while(!s.isEmpty()) {
			String str = s.pop();
			if (hm.get(str) == 1) {
				out.println(str);
				hm.replace(str, 0);
			}
		}

		out.close();
	}
}


