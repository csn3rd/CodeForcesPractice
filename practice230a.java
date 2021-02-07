import java.io.*;
import java.util.*;

public class practice230a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int s = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
				
		Dragons230a[] arr = new Dragons230a[n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(f.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[i] = new Dragons230a(x, y);
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < n; i++) {
			int x = arr[i].x;
			int y = arr[i].y;
			if (s <= x) {
				out.println("NO");
				out.close();
				return;
			}
			s += y;
		}

		out.println("YES");
		out.close();
	}
}

class Dragons230a implements Comparable {
	int x;
	int y;
	
	public Dragons230a(int a, int b) {
		x = a;
		y = b;
	}

	@Override
	public int compareTo(Object o) {
		return x - ((Dragons230a)o).x;
	}
}

