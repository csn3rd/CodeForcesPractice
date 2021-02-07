import java.io.*;
import java.util.*;

public class practice621a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		ArrayList<Integer> odds = new ArrayList<Integer>();
		long answer = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			answer += num;
			if (num%2 == 1) {
				odds.add(num);
			}
		}
		Collections.sort(odds);
		
		if (answer%2 == 0) {
			out.println(answer);
		} else {
			out.println(answer-odds.get(0));
		}

		out.close();
	}
}


