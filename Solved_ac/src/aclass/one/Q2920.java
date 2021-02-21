package aclass.one;

import java.util.Scanner;

// 문제 제목 : 음계
public class Q2920 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		scan.close();
		
		if (str.equals("1 2 3 4 5 6 7 8")) System.out.println("ascending");
		else if (str.equals("8 7 6 5 4 3 2 1")) System.out.println("descending");
		else System.out.println("mixed");
	}
}