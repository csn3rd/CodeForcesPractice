import java.io.*;
import java.util.*;

public class practice87b {
	public static void main(String[] args) throws Exception {
		
//		BufferedReader f = new BufferedReader(new  FileReader (new  File("sample.txt")));	
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt")));
//		StringTokenizer st = new StringTokenizer(f.readLine());

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		TreeMap<String, String> tm = new TreeMap<String, String>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(f.readLine());
			if (st.nextToken().equals("typedef")) {
				String type = st.nextToken();
				String name = st.nextToken();
				
				int balance = 0;
				c87b next = new c87b("", 100);
				while (!type.equals("void") && !type.equals("errtype") && next.val != 0) {
					next = update(type);
					type = next.type;
					balance += next.val;
					if (next.val == 0) {
						if (tm.containsKey(type)) {
							type = tm.get(type);
							next.val = 100;
						}
					}
				}
				
				if (type.equals("errtype")) {
					tm.put(name, "errtype");
				} else if (type.equals("void")) {
					type = "";
					if (balance < 0) {
						type = "errtype";
					} else {
						type += "void";
						for (int j = 0; j < balance; j++) {
							type += "*";
						}
					}
					tm.put(name, type);
				} else {
					tm.put(name, "errtype");
				}
			} else {
				String type = st.nextToken();
				
				int balance = 0;
				c87b next = new c87b("", 100);
				while (!type.equals("void") && !type.equals("errtype") && next.val != 0) {
					next = update(type);
					type = next.type;
					balance += next.val;
					if (next.val == 0) {
						if (tm.containsKey(type)) {
							type = tm.get(type);
							next.val = 100;
						}
					}
				}				
				
				if (type.equals("errtype")) {
					out.println("errtype");
				} else if (type.equals("void")) {
					type = "";
					if (balance < 0) {
						type = "errtype";
					} else {
						type += "void";
						for (int j = 0; j < balance; j++) {
							type += "*";
						}
					}
					out.println(type);
				} else {
					out.println("errtype");
//					if (balance < 0) {
//						for (int j = 0; j > balance; j--) {
//							type = "&"+type;
//						}
//						out.println(type);
//					} else {
//						for (int j = 0; j < balance; j++) {
//							type += "*";
//						}
//						out.println(type);
//					}
				}
				
			}
		}

		out.close();
	}
	
	public static c87b update(String type) {

		int dcount = 0;
		int pcount = 0;
		for (int j = 0; j < type.length(); j++) {
			if (type.charAt(j)=='*') {
				pcount++;
			} else if (type.charAt(j) == '&') {
				dcount++;
			}
		}
		
		type = type.substring(dcount, type.length()-pcount);
		
		return new c87b(type, pcount-dcount);
	}
}

class c87b {
	String type;
	int val;
	
	public c87b (String a, int b) {
		type = a;
		val = b;
	}
}


