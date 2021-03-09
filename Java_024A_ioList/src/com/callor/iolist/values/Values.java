package com.callor.iolist.values;

public class Values {

	// 정수를 매개변수로 받아서 문자열을 return하는 method
	public static String dLine(int count) {
		
		// ex) count가 50이라면 dLineFormat = "%050d"
		String dLineFormat = "%0" + count + "d";
		String dLine = String.format(dLineFormat, 0).replace("0", "=");
		
		return dLine;
	}
	
	public static String sLine(int count) {
		
		// ex) count가 50이라면 sLineFormat = "%050d"
		String sLineFormat = "%0" + count + "d";
		String sLine = String.format(sLineFormat, 0).replace("0", "-");
		
		return sLine;
	}
}
