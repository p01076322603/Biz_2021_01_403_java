package com.callor.oop;

import java.util.ArrayList;

/* List class
 * java 배열의 단점을 보완하기 위해 java의 jdk에 포함되어 있는
 * 데이터리스트를 관리하기 위한 클래스

 * 1. 데이터(값)들을 다량으로 저장하는 용도의 객체를 생성
 * 2. 배열을 선언하여 값을 저장하는 것과 비슷한 용도
 * 3. 처음 생성시 몇개의 데이터를 저장 할 지 결정하지 않는다
 * 4. 필요에 따라 데이터를 추가, 삭제, 수정 할 수 있다
 * 		──> 배열은 처음 생성한 개수를 변경하면 저장되어 있던
 * 			데이터를 사용할수 없게 된다.
 * 5. add() method를 사용하여 데이터를 저장, 추가할 수 있다
 * 6. get(주소) method를 사용하여 데이터를 읽을 수 있다.
 * 		──> 다른 변수에 저장하거나 출력할 수 있다 */
public class List_02 {

	public static void main(String[] args) {
	
		// 배열은 처음 생성 시 지정한 type 이외에는 어떠한 type도 저장할 수 없다
		// 이미 선언된 배열을 다른 type으로 다시 선언할 수 없다

//		int[] nums = new int[10];
//		nums[0] = 30;
//		nums[1] = "30";
//		nums[2] = "대한민국";

//		nums = new float[10];
//		nums[3] = 30f;
		
		// 공통 type의 ArrayList형 객체 생성
		// list1 객체에 여러 type의 데이터를 추가하여 관리할 수 있다
		ArrayList list1 = new ArrayList();
		list1.add(3); // 정수
		list1.add("대한민국"); // 문자열
		list1.add(3.2f); // 실수형(float)
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		/* 권장되는 ArrayList 객체 생성 방법
		 * ArrayList<String> 객체를 생성하면 String type의 데이터만 추가 할 수 있다
		 * <E> : Generic type
		 * Generic type은 int, long, float, double 등의 기본 자료형은 사용할 수 없다
		 * Integer, Long, Float, Double 등 클래스 자료형만 사용할 수 있다
		 * ──> VO 클래스를 사용할 수 있다.
		 * strList1은 ArrayList 객체이지만 여기에는 문자열만 저장하도록 하겠다는 뜻 */
		ArrayList<String> strList1 = new ArrayList<String>();

		// strList1은 Generic이 String으로 설정되어 있기 때문에 문자열 외에는 add 할 수 없다
		strList1.add("대한민국");
//		strList1.add(30);
//		strList1.add(30.0f);
		
		ArrayList<Integer> intList1 = new ArrayList<Integer>();
	
		// intList1은 Generic이 Integer로 설정되어 있기 때문에 정수 외에는 add 할 수 없다
//		intList1.add("대한민국");
		intList1.add(30);
//		intList1.add(30.0f);
		
	}
}
