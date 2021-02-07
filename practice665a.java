import java.io.*;
import java.util.*;

public class practice665a {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int a = Integer.parseInt(st.nextToken());
		int ta = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		
		int b = Integer.parseInt(st.nextToken());
		int tb = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine(), ":");
		int hour = Integer.parseInt(st.nextToken());
		int minutes = Integer.parseInt(st.nextToken());
		
		int time = (hour-5)*60+minutes;
		
		int count = 0;
		for (int i = 0; i < 1140; i++) {
			if (i%b == 0 && i + tb > time && i < time + ta) {
				count++;
			}
		}
		
		out.println(count);
		out.close();
	}
}


