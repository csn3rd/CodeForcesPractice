import java.io.*;
import java.util.*;

public class bsuitc {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		
		
		int min = Integer.MAX_VALUE;
		for (int j = 1; j < s.length(); j++) {
			int[] firstpart = new int[26];
			int[] secondpart = new int[26];
			for (int i = 0; i< s.length(); i++) {
				if (i < j) {
					firstpart[s.charAt(i)-'a']++;
				} else {
					secondpart[s.charAt(i)-'a']++;
				}
			}
			
			int count = 0;
			for (int i = 0; i < 26; i++)  {
				if (firstpart[i] > 0 && secondpart[i] == 0) {
					count+=firstpart[i];
				}
				if (secondpart[i] > 0 && firstpart[i] == 0) {
					count+=secondpart[i];
				}
			}
//			out.println(j + " " + count);
			
			min = Math.min(min, count);
		}
		out.println(min);
		out.close();
	}
}
