package com.github.p01076322603.IO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StudyBufferedWriter {

	public static void main(String[] args) throws IOException {
		
		String text = "Hello";
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(text);
		bw.newLine(); // "\n"
		bw.write(text);
		
		bw.flush();
		bw.close();
	}
}
