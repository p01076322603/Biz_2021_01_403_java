package com.github.p01076322603.IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StudyInputStreamReader {

	public static void main(String[] args) throws IOException {

		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		
		char[] ch = new char[3];
		reader.read(ch);
		
		System.out.println(ch);
	}
}
