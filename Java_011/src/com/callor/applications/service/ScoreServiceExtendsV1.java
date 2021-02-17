package com.callor.applications.service;

import java.util.Scanner; // Scanner 클래스를 사용하기 위한 import

/* 클래스의 extends(확장, 상속)
 * 
 * ScoreServiceV4 : Parent(부모) 클래스
 * ScoreServiceExtendsV1 : Child(자식) 클래스
 * 
 * 단순한 extends
 *  : 부모 클래스에 정의된 모든 method를
 *    코드 한줄 추가, 수정 없이 그대로 사용할 수 있다
 *    
 * 추가 extends
 * 	: 부모 클래스에 정의된 method와
 *    새롭게 추가된 method가 있는 확장된 클래스의 생성
 */
public class ScoreServiceExtendsV1 extends ScoreServiceV4 {

//	import java.util.Scanner; // Scanner 클래스를 사용하기 위한 import
	// 문자열형 변수 한개를 매개변수로 갖는 input() method			 // ex)"안녕하세요"
	public int input(String subject) { // main에서 호출하여 사용할 경우 문자열형 자료가 한개 들어가있어야 한다
					  // 매개변수							 // String = 문자열형 변수
		Scanner scan = new Scanner(System.in); // 키보드로부터 입력받기 위해 Scanner 클래스 호출 및 인스턴스화
											   // Scanner의 nextInt() method를 이용하여 정수를 입력받을 수 있다
											    // ex) scan.nextInt()
		int intScore = 0; // Scanner를 이용하여 입력받을 정수를 보관할 정수형 변수 intScore를 선언 및 초기화

		while (true) { // 조건이 없는 무한 반복문 (내부에서 조건에 의한 break;를 이용해 종료할 수 있다)
			System.out.print(subject + " 점수 입력 >> "); // 사용자로부터 수치를 입력 받을 prompt 생성 (입력 준비 상태를 나타냄)
			intScore = scan.nextInt(); // Scanner로 키보드를 이용해 값을 입력받아 정수형 변수 intScore에 저장
			// 밑의 if문을 통해 intScore가 부합하는 조건이 아니라면 (if & else if)
			// 반복문의 시작지점으로 돌아가 (line 33) prompt를 띄우고 값을 사용자로부터 다시 입력받는다
				   if (intScore <  0 ) { // intScore의 수치가 0 미만이라면 (사용자로부터 입력받은 수치가 0 미만이라면)
				System.out.println(subject + " 점수는 0점 이상 입력 !!"); // 문구 출력 후 while 반복문의 시작지점으로 돌아간다
			} else if (intScore > 100) { // 또는 intScore의 수치가 100 초과라면
				System.out.println(subject + " 점수는 100점 이하 입력 !!"); // 문구 출력 후 while 반복문의 시작지점으로 돌아간다
			} else { // 위의 두 경우가 아닌 나머지 경우라면 (0 <= intScore <= 100) == !(intScore < 0 && intScore > 100)
				break; // break;를 통해 속해있는 반복문을 탈출한다
			}
		} // 반복문의 끝부분
		  // 반복문을 break;를 통해 탈출하여 마지막으로 intScore에 입력받은 정수는 0부터 100사이의 수치를 가진다 
//		System.out.println("입력한 점수 : " + intScore); 
		// 문구와 함께 정수형 변수 intScore의 수치를 출력한다
		return intScore;
		
		// 호출한 코드에서
		// return 30; ==> int intKor에 30을 담아라
		// return 100; ==> int intKor에 100을 담아라
		
		// 사용자로부터 임의의 정수를 입력받아 
		// 입력받은 정수가 0부터 100 사이의 값이 아니라면 그 사실(미만, 초과)을 알려주고 다시 입력받아
		// 입력받은 정수가 0부터 100 사이의 값일 경우 Console에 사용자가 마지막으로 입력한 정수를 출력해주는 method()
	}
}