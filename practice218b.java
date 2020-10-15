import java.io.*;
import java.util.*;

public class practice218b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] seats1 = new int[m];
		int[] seats2 = new int[m];
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < m; t++) {
			seats1[t] = Integer.parseInt(st.nextToken());
			seats2[t] = seats1[t];
		}
		
		long money1 = 0;
		for (int i = 0; i < n; i++) {
			int max = 0;
			int index = 0;
			for (int j = 0; j < m; j++) {
				if (seats1[j] > max) {
					max = seats1[j];
					index = j;
				}
			}
			money1 += seats1[index];
			seats1[index]--;
		}
		

		long money2 = 0;
		for (int i = 0; i < n; i++) {
			int min = Integer.MAX_VALUE;
			int index = 0;
			for (int j = 0; j < m; j++) {
				if (seats2[j] != 0 && seats2[j] < min) {
					min = seats2[j];
					index = j;
				}
			}
			money2 += seats2[index];
			seats2[index]--;
		}
		
		out.println(money1 + " " + money2);
		out.close();
	}
}


