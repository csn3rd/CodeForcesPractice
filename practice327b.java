import java.io.*;
import java.util.*;

public class practice327b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		int curr = 5;
		for (int t = 0; t < n; t++) {
			if (arr.size() <= t) {
				while (!prime(curr, arr)) {
					curr += 2;
				}
				arr.add(curr);
				curr += 2;
			}
			out.print(arr.get(t) + " ");
		}

		out.close();
	}
	
	public static boolean prime(int curr, ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size() && Math.pow(arr.get(i), 2) <= curr; i++) {
			if (curr%arr.get(i) == 0) {
				return false;
			}
		}
		return true;
	}
}


