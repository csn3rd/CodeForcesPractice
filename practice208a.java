import java.io.*;
import java.util.*;

public class practice208a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		
		ArrayList<String> answer = new ArrayList<String>();
		
		int previous = 0;
		for (int i = 0; i < s.length()-3+1; i++) {
			if (s.substring(i,i+3).equals("WUB")) {
				String curr = s.substring(previous, i);
				if (previous != i) {
					answer.add(curr);
				}
				previous = i+3;
				i+=2;
			}
		}
		if (previous < s.length()) {
			answer.add(s.substring(previous));
		}
		
		for (int i = 0; i < answer.size(); i++)  {
			out.print(answer.get(i) + " ");
		}
		out.close();
	}
}


