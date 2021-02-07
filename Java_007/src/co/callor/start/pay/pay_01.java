package co.callor.start.pay;

public class pay_01 {

	public static void main(String args[]) {
		
		int pay = 4_789_811;
		int paper = 50_000;
		int count = pay / paper;

		System.out.println((paper) + "원권 : " + count);
		
		for( int i = 1, twoFive = 0 ; paper > 1 ; i = i * (-1) ) {
			
			if(i == 1) {
				twoFive = 5;
			}
			if(i == -1) {
				twoFive = 2;
			}
			
			pay = pay -= (count * paper);
			paper = paper / twoFive;
			count = pay / paper;
			
			System.out.println(paper + "원권 : " + count);
		}
		
		System.out.println("================================================");
		
		pay = 4_789_811;
		paper = 50_000;
		
		int sw = -1;
		
		/* for() 반복문이 무한 반복된다.
		 * for() 문을 종료하는 조건을 부여해야 한다
		 */
		for(  ; pay > 0 ;  ) {
			
			count = pay / paper;
			pay -= (paper * count);
			System.out.println(paper + "원권 : " + count);
			if( sw < 0 ) {
				paper = paper / 5;
			}
			if( sw > 0 ) {
				paper = paper / 2;
			}
			
			sw = sw * -1;
		}
	}
}

