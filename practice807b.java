import java.io.*;
import java.util.*;

public class practice807b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int p = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int score = x;
		while (score-50 >= y) {
			score -= 50;
		}
		
		boolean success = false;
		while (!success) {
			boolean won = false;
			int i = (score/50)%475;
			for (int j = 0; j < 25; j++) {
				i = (i*96 + 42)%475;
				won = won || (i == p-26);
			}
			if (won) {
				success = true;
//				out.println(score);
			} else {
				score += 50;
			}
		}
		
		out.println((int)Math.ceil(Math.max(0, score-x)/100.0));
		out.close();
	}
}


