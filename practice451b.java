import java.io.*;
import java.util.*;

public class practice451b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int l = -1;
		int r = -1;
		
		int[] arr = new int[n];
		ArrayList<Integer> arrl = new ArrayList<Integer>();
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			arr[t] = Integer.parseInt(st.nextToken());
			arrl.add(arr[t]);
		}
		
		Collections.sort(arrl);
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arrl.size(); i++) {
			hm.put(arrl.get(i), i);
		}
		
		for (int t = 0; t < n; t++) {
			if (hm.get(arr[t]) != t) {
				r = t;
				if (l == -1) {
					l = t;
				}
			}
		}
		
		if (l != -1) {
			for (int i = 0; i <= (r-l)/2; i++) {
				int temp = arr[l+i];
				arr[l+i] = arr[r-i];
				arr[r-i] = temp;
			}
		} else {
			l = 0;
			r = 0;
		}
				
		boolean works = true;
		for (int i = 0; i < n; i++) {
			if (hm.get(arr[i]) != i) {
				works = false;
			}
		}
		
		if (works) {
			out.println("yes");
			out.println((l+1) + " " + (r+1));
		} else {
			out.println("no");
		}

		out.close();
	}
}


