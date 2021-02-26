package com.callor.oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_03 {

	// Java 프로젝트에서 List 객체를 생성하기
	public static void main(String[] args) {
		
		// List 클래스를 사용하여 객체를 선언하고
		// ArrayList() 생성자를 호출하여 객체를 초기화 한다
		List<String> strList1 = new ArrayList<String>();
		
		List<Integer> intList1;
		intList1 = new ArrayList<Integer>();
		intList1 = new LinkedList<Integer>();
		intList1 = new Vector<Integer>();
		
		int[] num = new int[3];
//		num = float[3];
		
		ArrayList<Integer> intArrayList;
		intArrayList = new ArrayList<Integer>();
//		intArrayList = new LinkedList<Integer>();
//		intArrayList = new Vector<Integer>();
	}
}
