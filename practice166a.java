import java.io.*;
import java.util.*;

public class practice166a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		c166[] place = new c166[n];
		for (int t = 0; t < n; t++) {
			st = new StringTokenizer(f.readLine());
			place[t] = new c166(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(place);
		c166 value = place[n-k];
		int ans = 1;
		
		int i = n-k-1;
		while (i >= 0 && place[i].equals(value)) {
			i--;
			ans++;
		}
		
		i = n-k+1;
		while(i < n && place[i].equals(value)) {
			i++;
			ans++;
		}

		out.println(ans);
		out.close();
	}
}

class c166 implements Comparable {
	int problems;
	int time;
	
	public c166(int a, int b) {
		problems = a;
		time = b;
	}

	@Override
	public int compareTo(Object o) {
		if (((c166)o).problems == problems) {
			return ((c166)o).time - time;
		}
		return problems - ((c166)o).problems;
	}
	
	@Override
	public boolean equals(Object o) {
		return problems == ((c166)o).problems && time == ((c166)o).time;
	}
	
	@Override
	public String toString() {
		return problems + " " + time;
	}
}

