import java.io.*;
import java.util.*;

public class practice289b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int mod = 0;
		boolean diff = false;
		int[] matrix = new int[n*m];
		for (int t = 0; t < n; t++) {
			st = new StringTokenizer(f.readLine());
			for (int j = 0; j < m; j++) {
				int curr = Integer.parseInt(st.nextToken());
				matrix[t*m+j] = curr;
				if (t == 0 && j == 0) {
					mod = curr%d;
				} else {
					if (curr%d != mod) {
						diff = true;
					}
				}
			}
		}
		
		if (diff) {
			out.println(-1);
		} else {
			matrix = shuffleSort(matrix);
			int ans = 0;
			for (int i = 0; i < n*m; i++) {
				ans += Math.abs(matrix[n*m/2]-matrix[i])/d;
			}
			out.println(ans);
		}

		out.close();
	}
	
	public static int[] shuffleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int other = new Random().nextInt(arr.length);
			int temp = arr[other];
			arr[other] = arr[i];
			arr[i] = temp;
		}
		Arrays.sort(arr);
		return arr;
	}
}


