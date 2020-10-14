import java.io.*;
import java.util.*;

public class practice215a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int[] pedal = new int[n];
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			pedal[t] = Integer.parseInt(st.nextToken());
		}

		int m = Integer.parseInt(f.readLine());
		
		int[] rear = new int[m];
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < m; t++) {
			rear[t] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		int maxcount = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (rear[j]%pedal[i] == 0 && rear[j]/pedal[i] > max) {
					max = rear[j]/pedal[i];
					maxcount = 1;
				} else if (rear[j]%pedal[i] == 0 && rear[j]/pedal[i] == max) {
					maxcount++;
				}
			}
		}
		out.println(maxcount);
		out.close();
	}
}


