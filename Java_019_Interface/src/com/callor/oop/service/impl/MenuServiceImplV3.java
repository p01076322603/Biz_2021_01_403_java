package com.callor.oop.service.impl;

import java.util.Scanner;

import com.callor.oop.service.MenuService;

public class MenuServiceImplV3 implements MenuService {

	private Scanner scan;
	
	public MenuServiceImplV3() {
		scan = new Scanner(System.in);
	}
	
	/* 메뉴를 보여주고 선택된 메뉴에 따라 카트에 추가,
	 * 삭제 하거나 리스트를 보여줘야 한다

	 * 사용자가 메뉴를 보고 선택을 했을 때 선택된 결
	 * 과값을 호출한 곳에 return 해줘야 한다. 이렇게
	 * 설계를 변경하려면 method를 void type이 아닌 int
	 * 나 string 등 다른 type으로 변경해야 한다 클래
	 * 스 method를 변경하려면 interface부터 변경하고,
	 * interface를 implement한 모든 클래스를 다 변경
	 * 해야 한다.

	 * interface, class의 원형을 변경하지 않고 현재 
	 * method에만 어떤 기능을 추가하고자 한다. */

	/*이 기능을 MenuService에서 구현하는것이 아니라
	 * selectMenu()를 호출한 곳에서 구현을 해야 한다

	 * 호출한 곳에서 selectMenu() 결과에 따라 기능을
	 * 수행하려면 별도로 menuItem 변수를 하나 선언하
	 * 고 이 변수값으로 선택된 메뉴를 알수 있도록 하
	 * 겠다 */
	public Integer menuItem = null;
	
	/* 메뉴를 확인한 후 사용자가 메뉴를 선택하면 
	 * menuItem에 적절한 값을 담고 return을 수행하도
	 * 록 코드를 구현하였다

	 * Quit를 선택하면 menuItem = null;
	 * 1 ~ 3중에서 선택하면 menuItem = 선택한 숫자 */
	@Override
	public void selectMenu() {
		
		while (true) {
			System.out.println("===================");
			System.out.println("카트 메뉴 시스템 V3");
			System.out.println("-------------------");
			System.out.println("1. 카트 추가");
			System.out.println("2. 카트 삭제");
			System.out.println("3. 카트 리스트");
			System.out.println("Quit. 끝내기");
			System.out.println("-------------------");
			System.out.print("선택 >> ");
			
			String strMenu = scan.nextLine();
			
			if(strMenu.equalsIgnoreCase("Quit")) {
				this.menuItem = null;
				break;
			}
			
			try {
				int intMenu = Integer.valueOf(strMenu);
				if(intMenu >= 1 && intMenu <= 3) {
					this.menuItem = intMenu;
					break;
				}
			} catch (Exception e) {
				System.out.println("메뉴는 Quit, 1 ~ 3 까지만 입력하세요");
			}
		}
	}
}