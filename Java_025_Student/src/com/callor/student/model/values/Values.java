package com.callor.student.model.values;

public class Values {

    public static final int STUDENT_ID = 0;
    public static final int STUDENT_NAME = 1;
    public static final int STUDENT_MAJOR = 2;
    public static final int STUDENT_GRADE = 3;
    public static final int STUDENT_CLASS = 4;
    public static final int STUDENT_ADDRESS = 5;
    public static final int STUDENT_PNUMBER = 6;

    public static String dLine(int count) {

	String dLineFormat = "%0" + count + "d";
	String dLine = String.format(dLineFormat, 0).replace("0", "=");

	return dLine;
    }

    public static String sLine(int count) {

	String sLineFormat = "%0" + count + "d";
	String sLine = String.format(sLineFormat, 0).replace("0", "-");

	return sLine;
    }
}
