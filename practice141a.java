import java.io.*;
import java.util.*;

public class practice141a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s = f.readLine()+f.readLine();
		String t = f.readLine();
		
		if (permutation(s,t)) {
			out.println("YES");
		} else {
			out.println("NO");
		}
		out.close();
	}
	
	public static boolean permutation(String str1, String str2) {

	    if (str1.length() != str2.length())
	      return false;

	    char[] a = str1.toCharArray();
	    char[] b = str2.toCharArray();

	    Arrays.sort(a);
	    Arrays.sort(b);

	    return Arrays.equals(a, b);
	}

}


