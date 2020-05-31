import java.io.*;
import java.util.*;

public class practice490a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		ArrayList<Integer> ones = new ArrayList<Integer>();
		ArrayList<Integer> twos = new ArrayList<Integer>();
		ArrayList<Integer> threes = new ArrayList<Integer>();
		
		
		
		for (int i = 0; i < n ; i++) {
			int curr = Integer.parseInt(st.nextToken());
			if (curr == 1) {
				ones.add(i+1);
			}
			if (curr == 2) {
				twos.add(i+1);
			}
			if (curr == 3) {
				threes.add(i+1);
			}
		}

		int num = Math.min(Math.min(ones.size(), twos.size()), threes.size());
		
		out.println(num);
		
		for (int i = 0; i < num; i++) {
			out.println(ones.get(i) + " " + twos.get(i) + " " + threes.get(i));
		}
		out.close();
	}
}


