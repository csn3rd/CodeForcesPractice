import java.io.*;
import java.util.*;

public class practice1b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < T; t++) {
			String line = f.readLine();
			String ans = "";
			
			if (line.charAt(0) == 'R' && line.charAt(1) >= '0' && line.charAt(1) <= '9' && line.contains("C")) {
				st = new StringTokenizer(line.substring(1), "C");
				int row = Integer.parseInt(st.nextToken());
				int col = Integer.parseInt(st.nextToken());
				
				while (col > 0) {
					int div = col%26;
					if (div == 0) {
						div = 26;
						col -= 26;
					}
					col /= 26;
					ans = (char)('A'+div-1) + ans;
				}
				ans += row;
			} else {
				int i;
				for (i = line.length()-1; i >= 0 && line.charAt(i) < 'A'; i--) {
					ans = line.charAt(i) + ans;
				}
				ans = 'R' + ans;
				
				int col = 0;
				for (int j = 0; j <= i; j++) {
					col += (int)(line.charAt(i-j)-'A'+1) * Math.pow(26, j);
				}
				ans += "C" + col;
			}
			out.println(ans);	
		}
		
		out.close();
	}
}


