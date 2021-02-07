import java.io.*;
import java.util.*;

public class practice298b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int t = Integer.parseInt(st.nextToken());
		int sx = Integer.parseInt(st.nextToken());
		int sy = Integer.parseInt(st.nextToken());
		int ex = Integer.parseInt(st.nextToken());
		int ey = Integer.parseInt(st.nextToken());
		
		String wind = f.readLine();
		int dx = 0;
		int dy = 0;
		boolean ydone = false;
		boolean xdone = false;
		for (int i = 0; i <= wind.length(); i++) {
			if (ydone || ey >= sy && sy+dy == ey) {
				ydone = true;
			}
			if (ydone || sy >= ey && ey+dy == sy) {
				ydone = true;
			}
			if (xdone || ex >= sx && sx+dx == ex) {
				xdone = true;
			}
			if (xdone || sx >= ex && ex+dx == sx) {
				xdone = true;
			}
			
			if (ydone && xdone) {
				out.println(i);
				out.close();
				return;
			}
			
			if (i < wind.length() && wind.charAt(i)=='N') {
				if (!ydone && ey > sy) {
					dy++;
				}
			} else if (i < wind.length() && wind.charAt(i)=='S') {
				if (!ydone && sy > ey) {
					dy++;
				}
			} else if (i < wind.length() && wind.charAt(i)=='E') {
				if (!xdone && ex > sx) {
					dx++;
				}
			} else if (i < wind.length()) {
				if (!xdone && sx > ex) {
					dx++;
				}
			}
		}

		out.println(-1);
		out.close();
	}
}


