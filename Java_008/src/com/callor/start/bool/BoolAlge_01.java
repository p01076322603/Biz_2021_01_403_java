package com.callor.start.bool;

/* Boolean algebra
 *  
 *  A		   B		  C
 * (3χ + 3) + (4χ - 2) + (5χ + 3)
 * 
 *  A + B + C
 *
 */

public class BoolAlge_01 {

	public static void main(String args[]) {
		
		boolean bYes = true; // 1
		boolean bNo = false; // 0
		
		// && : AND 
		System.out.println(bYes && bNo); // 1 * 0 = 0 : false
		// || : OR (filter 기호)
		System.out.println(bYes || bNo); // 1 + 0 = 1 : true
		
	/*	bYes OR bNo
	 *	1 + 0 = 1						 true  OR false == true
	 *	0 + 1 = 1						 false OR true  == true
	 *	1 + 1 = 1 (1 이상은 무조건 true) true  OR true  == true
	 *  0 + 0 = 0						 false OR false == false
	 */
	 	
	/*	bYes AND bNo
	 * 	1 * 0 = 0						 true  AND false == false
	 * 	0 * 1 = 0						 false AND true  == false
	 *  0 * 0 = 0						 false AND false == false
	 *  1 * 1 = 1						 true  AND true  == true
	 */

		System.out.println("==============");
		System.out.println("t && t : " + (true  && true));  // true
		System.out.println("t && f : " + (true  && false)); // false
		System.out.println("f && t : " + (false && true));  // false
		System.out.println("f && f : " + (false && false)); // false
	
		System.out.println("==============");
		System.out.println("t || t : " + (true  || true));  // true
		System.out.println("t || f : " + (true  || false)); // true
		System.out.println("f || t : " + (false || true));  // true
		System.out.println("f || f : " + (false || false)); // false

		System.out.println("==============");
	}
}
