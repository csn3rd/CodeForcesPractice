import java.io.*;
import java.util.*;

public class practice469a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		st =  new StringTokenizer(f.readLine());
		int p  = Integer.parseInt(st.nextToken());
		for (int i = 0; i < p; i++) {
			arr[Integer.parseInt(st.nextToken())-1]++;
		}
		
		st =  new StringTokenizer(f.readLine());
		int q  = Integer.parseInt(st.nextToken());
		for (int i = 0; i < q; i++) {
			arr[Integer.parseInt(st.nextToken())-1]++;
		}
		
		if (p + q < n || !pass(arr)) {
			out.println("Oh, my keyboard!");
		} else {
			out.println("I become the guy.");
		}
		
		out.close();
	}
	
	public static boolean pass (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
}


