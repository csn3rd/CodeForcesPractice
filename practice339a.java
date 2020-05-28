import java.io.*;
import java.util.*;

public class practice339a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		int[] arr = new int[s.length()/2+1];
		for (int i = 0; i < s.length(); i+=2) {
			arr[i/2] = s.charAt(i)-'0';
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length-1; i++) {
			out.print(arr[i]+"+");
		}
		out.print(arr[arr.length-1]);
		out.println();
		out.close();
	}
}


