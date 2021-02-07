import java.io.*;
import java.util.*;

public class practice285c {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int[] nums = new int[n];
		st = new StringTokenizer(f.readLine());
		for (int t = 0; t < n; t++) {
			nums[t] = Integer.parseInt(st.nextToken());
		}
		
		nums = shuffleSort(nums);
		
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += Math.abs((i+1)-nums[i]);
		}

		out.println(ans);
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


