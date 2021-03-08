package com.callor.score.service.values;

public class Values {

	public static final String dLine;
	public static final String sLine;
	
	// static final 변수 생성하기
	static {
		dLine = String.format("%070d", 0).replace("0", "=");
		sLine = String.format("%070d", 0).replace("0", "-");
	}
}