import java.io.*;
import java.util.*;

public class practice105a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = (int)(Double.parseDouble(st.nextToken())*100+0.1);
		
		ArrayList<c105a> arr = new ArrayList<c105a>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(f.readLine());
			String name = st.nextToken();
			int level = Integer.parseInt(st.nextToken());
			if ((int)(level*k) >= 10000) {
				arr.add(new c105a(name, (int)(level*k/100)));
			}
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(f.readLine());
			String name = st.nextToken();
			c105a curr = new c105a(name, 0);
			if (!arr.contains(curr)) {
				arr.add(curr);
			}
		}
		
		out.println(arr.size());
		Collections.sort(arr);
		for (int i = 0; i < arr.size(); i++) {
			out.println(arr.get(i).name + " " + arr.get(i).level);
		}
		
		out.close();
	}
}

class c105a implements Comparable {
	String name;
	int level;
	
	public c105a(String a, int b) {
		name = a;
		level = b;
	}

	@Override
	public int compareTo(Object o) {
		return name.compareTo(((c105a)o).name);
	}
	
	@Override
	public boolean equals(Object o) {
		return name.equals(((c105a)o).name);
	}
}


