package com.callor.variable;

public class Test {

	public static void main(String args[]) {
		
		int intDan = 0;
		int num1 = 1;
		
		for ( ; intDan < 3 ; ) {
			
			intDan += 1;
			num1 = 0;
			
			for ( ; num1 < 9 ; ) {

				num1 += 1;

				System.out.println(intDan +      " x " + num1 + " = " +  (intDan      * num1) + "   " + 
								  (intDan + 3) + " x " + num1 + " = " + ((intDan + 3) * num1) + "   " +
							      (intDan + 6) + " x " + num1 + " = " + ((intDan + 6) * num1));
			}
			
			System.out.println();
			
		}

	}
	
}
