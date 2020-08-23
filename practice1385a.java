import java.io.*;
import java.util.*;

public class practice1385a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int T = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(f.readLine());
			int[] arr = new int[3];
			for (int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			if (arr[0] == arr[1] && arr[1] == arr[2]) {
				out.println("YES");
				out.println(arr[0] + " " + arr[0] + " " + arr[0]);
			} else if (arr[1] == arr[2]) {
				out.println("YES");
				out.println(arr[0] + " " + arr[0] + " " + arr[2]);
			} else {
				out.println("NO");
			}
		}

		out.close();
	}
}


