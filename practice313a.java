import java.io.*;
import java.util.*;

public class practice313a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine();
		int ans = Math.max(Integer.parseInt(s), Math.max(Integer.parseInt(s.substring(0,s.length()-2)+s.charAt(s.length()-1)), Integer.parseInt(s.substring(0,s.length()-1))));

		out.println(ans);
		out.close();
	}
}


