package com.callor.applications;

import java.util.Scanner;

/* 학생 3명의 국어, 영어 수학 점수를 키보드로 입력받아 console에 리스트를 출력
 * (학생명의 과목점수를 저장할 배열을 선언) (intKor, intEng, intMath)

 * 1. 학생 3명의 3과목의 점수를 저장할 배열
 * 2. ★ 배열이 나오면 일단 for 반복문이 한번쯤은 나타난다 ★
 * 3. 학생 3명의 과목 점수를 어떻게 입력받을 것인가?
 * 4. 학생 3명의 과목 점수를 어떻게 출력할 것인가
 */ 

public class Score_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] name = {"학생 1", "학생 2", "학생 3"};

/*		String[] name = new String[3];
		name[0] = "학생 1";
		name[1] = "학생 2";
		name[2] = "학생 3";
*/
 
		// 변수는 1개의 변수에 1개의 값만 저장할 수 있다
		// int intKor;
		
		// 3명 학생의 과목점수를 저장해야 하기 때문에 각 과목을 배열로 선언
		int[] intKor = new int[name.length];
		int[] intEng = new int[name.length];
		int[] intMath = new int[name.length];

		// [개수] : 필요한 개수만큼 배열을 만들어라
		int[] intSum = new int[5];
		int[] intAvg = new int[100];
		
		/* 3명 학생의 과목 성적 입력받기 */
		// 각 과목을 모아 입력받기
		
 /*	    // 학생 인원수가 몇명 안될때는 아래처럼 단순히 복사 붙이기로 작성해도 된다
		System.out.println("1번 학생 >> ");
		intkor[0] = scan.nextInt();
		System.out.println("2번 학생 >> ");
		intkor[1] = scan.nextInt();
		System.out.println("3번 학생 >> ");
		intkor[2] = scan.nextInt();
 */
 /*		// for 반복문을 이용하여 반복되는 코드를 단순하게 만든다
 		for (int index = 0; index < intKor.length; index++) {
			int num = index + 1;
			System.out.println(num + "번 학생 >> ");
			intEng[index] = scan.nextInt();
		}
		System.out.println();
 */
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%s의 국어 점수를 입력하세요 >> ", name[i]);
			intKor[i] = scan.nextInt();
		}
		System.out.println();
	
		for (int i = 0; i < intEng.length; i++) {
			System.out.printf("%s의 영어 점수를 입력하세요 >> ", name[i]);
		 	intEng[i] = scan.nextInt();
		}
		System.out.println();
		
		for (int i = 0; i < intMath.length; i++) {
			System.out.printf("%s의 수학 점수를 입력하세요 >> ", name[i]);
		 	intMath[i] = scan.nextInt();
		}
		System.out.println();
		
		// 학생별로 입력받기
 /*		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s의 국어 점수를 입력하세요 >> ", name[i]);
			intKor[i] = scan.nextInt();
			System.out.printf("%s의 영어 점수를 입력하세요 >> ", name[i]);
		 	intEng[i] = scan.nextInt();
		 	System.out.printf("%s의 수학 점수를 입력하세요 >> ", name[i]);
		 	intMath[i] = scan.nextInt();
		 	System.out.println();
		}
 */	
		System.out.println("============================");
		System.out.println("\t국어\t영어\t수학");
		System.out.println("----------------------------");
		
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s\t%4d\t%4d\t%4d\n",
					name[i], intKor[i], intEng[i], intMath[i]);
		}
		
		System.out.println("============================");
	}
}