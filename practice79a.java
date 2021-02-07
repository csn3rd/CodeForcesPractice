import java.io.*;
import java.util.*;

public class practice79a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int turn = 0;
		boolean done = false;
		while (!done) {
			if (turn % 2 == 0) {
				if (x >= 2 && y >= 2) {
					x -= 2;
					y -= 2;
				} else if (x >= 1 && y >= 12) {
					x -= 1;
					y -= 12;
				} else if (y >= 22) {
					y -= 22;
				} else {
					done = true;
					turn--;
				}
				turn++;
			} else {
				if (y >= 22) {
					y -= 22;
				} else if (x >= 1 && y >= 12) {
					x -= 1;
					y -= 12;
				} else if (x >= 2 && y >= 2) {
					x -= 2;
					y -= 2;
				} else {
					done = true;
					turn--;
				}
				turn++;
			}
		}

		if (turn%2 == 0) {
			out.println("Hanako");
		} else {
			out.println("Ciel");
		}
		out.close();
	}
}


