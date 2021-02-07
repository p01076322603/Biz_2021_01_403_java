package com.callor.start.loop;

public class Loop_02 {

	public static void main(String args[]) {
		
		for( int i = 0 ; i < 10 ; i += 1 ) {
			
		}

		for(int i = 0 ; i < 10 ; i++) {
			System.out.println();
	    }
		
		// i 값이 100부터 시작하여 i < 0까지 1씩 감소하며 반복한다.
		for(int i = 100 ; i > 0 ; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int num = 0;
		
		num = num + 1;  // (+1)
		num += 1;	    // (+1)
		num++;		    // (+1)	
		++num;          // (+1)
		
		System.out.println(num);  // +4
		
		int num1 = 0;
		 
	    num1 = num1 - 1;// (-1)
	    num1 -= 1;		// (-1)
	    num1--;			// (-1)
	    --num1;			// (-1)

	    System.out.println(num1); // -4
	    
	}
	
}
