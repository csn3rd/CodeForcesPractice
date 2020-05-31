import java.io.*;
import java.util.*;

public class bsuite {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		int count = 0;
        ArrayList<Integer> singles = new ArrayList<Integer>();
        TreeSet<Integer> doubles = new TreeSet<Integer>();
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();

		st = new StringTokenizer(f.readLine());
		for (int i = 0; i < n; i++) {
			int curr = Integer.parseInt(st.nextToken());
			for (int j = 0; j < singles.size(); j++) {
				if (doubles.contains(curr-singles.get(j))) {
					count++;
					j = i;
				}
			}
			for (int j = 0; j < singles.size(); j++) {
				doubles.add(curr+singles.get(j));
			}
			doubles.add(curr+curr);
			if (hashSet.add(curr)) {
				singles.add(curr);
			}
		}

		out.println(count);
		out.close();
	}
}


