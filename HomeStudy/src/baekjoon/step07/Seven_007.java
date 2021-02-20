package baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Seven_007 {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder a = new StringBuilder(st.nextToken());
		StringBuilder b = new StringBuilder(st.nextToken());
		
		a.reverse();
		b.reverse();

		if (Integer.valueOf(a.toString()) > Integer.valueOf(b.toString()))
			 System.out.println(a);
		else System.out.println(b);
	}
}
