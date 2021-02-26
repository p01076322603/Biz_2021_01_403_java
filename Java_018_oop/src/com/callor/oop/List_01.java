package com.callor.oop;

import java.util.List;
import java.util.ArrayList;

public class List_01 {

	/* List 
	 * 배열과 성질이 유사한 Java의 클래스
	 * 개수가 정해지지 않은(최초 0개) 배열을 생성 하는 것과 같다 */
	public static void main(String[] args) {
		ArrayList<String> books = new ArrayList<String>();
		List<String> strNames = new ArrayList<String>();

		// books list에 저장된 데이터들 중에서 0번 위치에 저장된 데이터를 Console에 출력하라
		try {
			System.out.println("여기는 add 하기 전");
			System.out.println(books.get(0));
		} catch (IndexOutOfBoundsException e) {
		}

		// books List에 도서명 추가하기
		// List에 add() method를 사용하여 값을 추가하면 자동으로 개수가 추가되면서 데이터가 저장된다
		books.add("자바프로그래밍");
		books.add("자바의정석");
		books.add("그리스로마신화");
		
		
		try {
			System.out.println("add 한 뒤 : ");
			System.out.println(books.get(0));
			System.out.println(books.get(1));
			System.out.println(books.get(2));
		} catch (IndexOutOfBoundsException e) {
		}
	}
}
