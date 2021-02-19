package baekjoon.step06;

import java.util.Arrays;

public class Six_002 {

	static void d(int n) {
		
		int nArr[] = {};
		for (int i = (int) Math.log10(n); i <= 0 ; i--) {
			
			nArr[i] = n % 10;
			n /= 10;
		}
		
		System.out.println(Arrays.toString(nArr));
	
	}

	public static void main(String[] args) {

		d(24892348);
	}
}
