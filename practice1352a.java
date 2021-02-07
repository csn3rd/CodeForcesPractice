import java.io.*;
import java.util.*;

public class practice1352a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		

		int t = Integer.parseInt(f.readLine());
		
		for (int i = 0; i < t; i++) {
			String s = (f.readLine());
			int count = 0;
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(s.length()-1-j)!='0') {
					arr.add((int)Math.pow(10, j)*(s.charAt(s.length()-1-j)-'0'));
					count++;
				}
			}
			out.println(count);
			for (int j = 0; j < count; j++) {
				out.print(arr.get(j) + " ");
			}
			out.println();
		}

		out.close();
	}
}


