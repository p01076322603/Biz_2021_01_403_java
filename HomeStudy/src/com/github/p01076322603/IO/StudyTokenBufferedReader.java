package com.github.p01076322603.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StudyTokenBufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); // 10 10 10
		
		// StringTokenizer
		System.out.println(Integer.parseInt(st.nextToken()) + 10); // 20
		System.out.println(st.nextToken() + 10); // 1010
		System.out.println(st.nextToken()); // 10

		System.out.println("========");
		
		String[] tokens = (br.readLine()).split(" "); // 10 10 10
		
		// Split		
		System.out.println(Integer.parseInt(tokens[0]) + 10); // 20
		System.out.println(tokens[1] + 10); // 1010
		System.out.println(tokens[2]); // 10
	}
}
