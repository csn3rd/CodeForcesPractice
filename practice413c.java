import java.io.*;
import java.util.*;

public class practice413c {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		
		c413c[] questions = new c413c[n];
		
		for (int i = 0; i < n; i++) {
			questions[i] = new c413c(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(f.readLine());
		
		for (int i = 0; i < m; i++) {
			int index = Integer.parseInt(st.nextToken());
			questions[index-1].auction = true;
		}
		
		Arrays.sort(questions);
		
		long score = 0;
		for (int i = 0; i < n; i++) {
			if (questions[i].auction && score > questions[i].price) {
				score *= 2;
			} else {
				score += questions[i].price;
			}
		}

		out.println(score);
		out.close();
	}
}

class c413c implements Comparable {
	int price;
	boolean auction;
	
	public c413c(int a) {
		price = a;
	}

	@Override
	public int compareTo(Object o) {
		if (auction && !((c413c)o).auction) {
			return 1;
		} else if (auction) {
			return ((c413c)o).price - price;
		} else if (((c413c)o).auction) {
			return -1;
		}
		return price - ((c413c)o).price;
	}
	
	
}
