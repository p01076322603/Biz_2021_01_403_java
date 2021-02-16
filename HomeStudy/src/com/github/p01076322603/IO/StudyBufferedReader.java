package com.github.p01076322603.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StudyBufferedReader {

	public static void main(String[] args) throws IOException {
		
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
	
		// BufferedReader <- InputStreamReader <- InputStream
		// BufferedReader = InputStreamReader를 이용하여 Char를 String으로 줄바꿈 전까지 받아온다
		// InputStreamReader = InputStream을 이용하여 Byte를 Char로 받아온다
		// InputStream = 입력을 Byte로 받아와 int형 안에 저장한다
		
		// 간소화
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine(); // return 값이 String으로 고정되어 있다 
		System.out.println(a);
		
	//	int aa = Integer.parseInt(a); 정수형으로 변환시키는 방법
	//	System.out.println(aa);
		
		String b = br2.readLine();
		System.out.println(b);
	}
}
