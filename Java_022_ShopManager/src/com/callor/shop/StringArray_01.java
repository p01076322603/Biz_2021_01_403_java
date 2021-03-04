package com.callor.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.shop.model.CartVO;

public class StringArray_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt();
		}

		List<CartVO> cartList = new ArrayList<CartVO>();

		/* 1. cartList의 요소 개수만큼 반복하는 반복문 생성
		 * 2. cartList의 처음부터 끝까지 반복하면서 요소들을 하나씩 getter하여
		 * 	  i 객체에 담아준다
		 * 3. for()내의 코드로 i 객체값을 전달하여 사용할수 있도록 만들어준다 */
		for (CartVO i : cartList) {
			System.out.println(i.getUserName());
		}
	}
}
