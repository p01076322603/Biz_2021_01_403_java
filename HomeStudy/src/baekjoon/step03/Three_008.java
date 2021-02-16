package baekjoon.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Three_008 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();

			int T = Integer.parseInt(br.readLine());
			
			int a, b;
			
			for (int i = 0; i < T; i++) {
			
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				
				sb.append("Case #").append(i + 1).append(": ").append(a).append(" + ")
				  .append(b).append(" = ").append(a + b).append("\n");
			}
			
			System.out.println(sb);
			
			br.close();
			
		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}
