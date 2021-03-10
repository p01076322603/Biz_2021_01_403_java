package com.callor.score.values;

public class Values {
    
    public final static int LINE_LENGTH = 53;
    
    public final static int MENU_FIRST = 1;
    
    public final static int SCORE_TO_LIST = 1;
    public final static int LIST_TO_FILE = 2;
    public final static int PRINT_SCORE = 3;
    
    public final static int MENU_LAST = 3;

    public static final int MAX_SUBJECT = 4;

    public static String dLine(int count) {
	return String.format("%0" + count + "d", 0).replace("0", "=");
    }

    public static String sLine(int count) {
	return String.format("%0" + count + "d", 0).replace("0", "-");
    }

}
