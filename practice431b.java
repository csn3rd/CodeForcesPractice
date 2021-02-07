import java.io.*;
import java.util.*;

public class practice431b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int[][] arr = new int[5][5];
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(f.readLine());
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		out.println(brute(arr, ""));
		out.close();
	}
	
	public static int brute(int[][] arr, String s) {
		if (s.length() == 5) {
			return check(arr, s);
		}
		int max = 0;
		for (int i = 0; i < 5; i++) {
			max = Math.max(max, brute(arr, s+i));
		}
		return max;
	}
	
	public static int check(int[][] arr, String s) {
		int[] counts = new int[5];
		for (int i = 0; i < s.length(); i++) {
			counts[s.charAt(i)-'0']++;
			if (counts[s.charAt(i)-'0'] > 1) {
				return 0;
			}
		}
		int ans = 0;
		ans += arr[s.charAt(0)-'0'][s.charAt(1)-'0'];
		ans += arr[s.charAt(1)-'0'][s.charAt(0)-'0'];
		ans += arr[s.charAt(1)-'0'][s.charAt(2)-'0'];
		ans += arr[s.charAt(2)-'0'][s.charAt(1)-'0'];
		ans += 2*arr[s.charAt(2)-'0'][s.charAt(3)-'0'];
		ans += 2*arr[s.charAt(3)-'0'][s.charAt(2)-'0'];
		ans += 2*arr[s.charAt(3)-'0'][s.charAt(4)-'0'];
		ans += 2*arr[s.charAt(4)-'0'][s.charAt(3)-'0'];
		return ans;
		
	}
}


