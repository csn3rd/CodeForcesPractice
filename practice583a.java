import java.io.*;
import java.util.*;

public class practice583a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> h = new ArrayList<Integer>();
		ArrayList<Integer> v = new ArrayList<Integer>();
		
		ArrayList<Integer> days = new ArrayList<Integer>();
		
		for (int i = 0; i < n*n; i++) {
			st = new StringTokenizer(f.readLine());
			int H = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			if (!h.contains(H) && !v.contains(V)) {
				days.add(i+1);
				h.add(H);
				v.add(V);
			}
		}

		for (int i = 0; i < days.size()-1; i++) {
			out.print(days.get(i) + " ");
		}
		out.println(days.get(days.size()-1));
		out.close();
	}
}


