import java.io.*;
import java.util.*;

public class practice4c {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int n = Integer.parseInt(f.readLine());
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String curr = f.readLine();
			int count = hm.getOrDefault(curr, 0);
			if (count > 0) {
				out.println(curr+(count));
			} else {
				out.println("OK");
			}
			hm.put(curr, (count+1));
		}

		out.close();
	}
}


