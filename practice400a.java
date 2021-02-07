import java.io.*;
import java.util.*;

public class practice400a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int T = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < T; t++) {
			String values = f.readLine();
			int count = 0;
			ArrayList<Integer> dim = new ArrayList<Integer>();
			for (int i = 1; i <= 12; i++) {
				if (12%i == 0 && works(values, i)) {
					dim.add(i);
					count++;
				}
			}
			out.print(count);
			for (int i = 0; i < count; i++) {
				out.print(" " + dim.get(i) + "x" + (12/dim.get(i)));
			}
			
			out.println();
		}

		out.close();
	}
	
	public static boolean works (String v, int r) {
		boolean won = false;
		for (int i = 0; i < 12/r; i++) {
			boolean col = true;
			for (int j = 0; j < 12; j++) {
				if (j%(12/r) == i) {
					col = col && v.charAt(j)=='X';
				}
			}
			won = won || col;
		}
		return won;
	}
}


