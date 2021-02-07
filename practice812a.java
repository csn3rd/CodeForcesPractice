import java.io.*;
import java.util.*;

public class practice812a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer("");
		
		boolean[][] arr = new boolean[4][4];
		
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(f.readLine());
			for (int j = 0 ; j < 4; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken())==1;
			}
		}
		
		boolean accident = false;
		if (arr[0][3] && (arr[0][0] || arr[0][1] || arr[0][2] || arr[1][0] || arr[2][1] || arr[3][2])) {
			accident = true;
		} else if (arr[1][3] && (arr[1][0] || arr[1][1] || arr[1][2] || arr[2][0] || arr[3][1] || arr[0][2])) {
			accident = true;
		} else if (arr[2][3] && (arr[2][0] || arr[2][1] || arr[2][2] || arr[3][0] || arr[0][1] || arr[1][2])) {
			accident = true;
		} else if (arr[3][3] && (arr[3][0] || arr[3][1] || arr[3][2] || arr[0][0] || arr[1][1] || arr[2][2])) {
			accident = true;
		}

		if (accident) {
			out.println("YES");
		} else {
			out.println("NO");
		}
		
		out.close();
	}
}


