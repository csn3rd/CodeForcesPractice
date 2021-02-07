import java.io.*;
import java.util.*;

public class practice205a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int min = Integer.MAX_VALUE;
		int count = 0;
		int index = 0;
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			int time = Integer.parseInt(st.nextToken());
			if (time < min) {
				min = time;
				count = 1;
				index = t;
			} else if (time == min) {
				count++;
			}
		}
		
		if (count > 1) {
			out.println("Still Rozdil");
		} else {
			out.println(index+1);
		}

		out.close();
	}
}


