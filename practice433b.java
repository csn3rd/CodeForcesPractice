import java.io.*;
import java.util.*;

public class practice433b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		long[] prefixsums = new long[n+1];
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			arr[t] = Integer.parseInt(st.nextToken());
			prefixsums[t+1] = prefixsums[t] + arr[t];
		}
		
		arr = shuffleSort(arr);
		long[] prefixsums2 = new long[n+1];
		for (int i = 0; i < n; i++) {
			prefixsums2[i+1] = prefixsums2[i]+arr[i];
		}
		
//		out.println(Arrays.toString(prefixsums));
//		out.println(Arrays.toString(prefixsums2));
		
		int m = Integer.parseInt(f.readLine());
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(f.readLine());
			int type = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			if (type == 1) {
				out.println(prefixsums[r]-prefixsums[l-1]);
			} else {
				out.println(prefixsums2[r]-prefixsums2[l-1]);
			}
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


