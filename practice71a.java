import java.io.*;
import java.util.*;

public class practice71a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int n = Integer.parseInt(f.readLine());
		
		for (int i = 0; i < n; i++) {
			String word = f.readLine();
			if (word.length() > 10) {
				out.println(word.charAt(0)+""+(word.length()-2)+""+word.charAt(word.length()-1));
			} else {
				out.println(word);
			}
		}
		out.close();
	}
}


