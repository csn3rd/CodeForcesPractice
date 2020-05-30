import java.io.*;
import java.util.*;

public class practice500a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(f.readLine());
		int[] vis = new int[n];
		int[] a = new int[n];
		for (int i = 0; i < n-1; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			
		}

		vis[t-1] = 1;
	    for(int i = t - 2; i >= 0 ; i--) {
	        vis[i] = vis[i + a[i]];
	    }
	    
	    if(vis[0]==1) {
	        out.println("YES");
	    } else {
	        out.println("NO");
	    }
	    
	    out.close();
	}
}


