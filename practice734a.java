import java.io.*;
import java.util.*;

public class practice734a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		f.readLine();
		
		String s = f.readLine();
		
		int score = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='A') {
				score++;
			} else {
				score--;
			}
		}
		
		if (score > 0) {
			out.println("Anton");
		} else if (score < 0) {
			out.println("Danik");
		} else {
			out.println("Friendship");
		}
		out.close();
	}
}


