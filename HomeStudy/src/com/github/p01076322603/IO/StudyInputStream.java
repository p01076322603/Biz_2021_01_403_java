package com.github.p01076322603.IO;

import java.io.InputStream;

public class StudyInputStream {

	public static void main(String args[]) throws Exception {
		
		InputStream in = System.in;

		byte[] bt = new byte[3];
		in.read(bt);
		
		System.out.print(bt[0]+ " ");
		System.out.print(bt[1]+ " ");
		System.out.print(bt[2]+ " ");	
	}
}
