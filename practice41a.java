import java.io.*;
import java.util.*;

public class practice41a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		String t = f.readLine();
		boolean correct = s.length()==t.length();
		
		int i = 0;
		int j = t.length()-1;
		
		while (correct && i < s.length() && j >= 0) {
			correct = correct && s.charAt(i)==t.charAt(j);
			i++;
			j--;
		}
		if (correct) {
			out.println("YES");
		} else {
			out.println("NO");
		}
		out.close();
	}
}


