import java.io.*;
import java.util.*;

public class practice478a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int sum = Integer.parseInt(st.nextToken());
		sum += Integer.parseInt(st.nextToken());
		sum += Integer.parseInt(st.nextToken());
		sum += Integer.parseInt(st.nextToken());
		sum += Integer.parseInt(st.nextToken());
		
		if (sum > 0 && sum%5 == 0) {
			out.println(sum/5);
		} else {
			out.println(-1);
		}

		out.close();
	}
}


