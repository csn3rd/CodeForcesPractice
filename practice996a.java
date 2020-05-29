import java.io.*;
import java.util.*;

public class practice996a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int[] denominations = new int[]{1, 5, 10, 20, 100};
		
		int count = 0;
		int i = 4;
		while(i >= 0) {
			if (n < denominations[i]) {
				i--;
			} else {
				count++;
				n-=denominations[i];
			}
		}
		
		out.println(count);
		out.close();
	}
}


