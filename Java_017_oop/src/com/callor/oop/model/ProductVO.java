package com.callor.oop.model;

/* 쇼핑몰에서 판매되는 상품을 관리하기 위한 데이터를
 * 저장할 용도의 Value Object 클래스 디자인(설계)

 * ProductVO 클래스는 Product.VO java 파일로 생성되어 저장된다
 * 클래스를 만들고 파일로 저장하는 과정
 * ==> 클래스 디자인, 설계 [클래스 프로토타입(Prototype)작성]

 * 클래스 프로토타입은 객체를 생성하기 위한 설계도 코드

 *  VO(Value Object) 클래스에서 가장 중요한 부분은 
 *  인스턴스 변수를 선언하는 부분이다

 * 상품관리를 위해 필요한 데이터 : 
 * Product : 상품코드, 상품명 Item : 품목명 Dept : 거래처
 * 단가 : 매입단가, 매출단가 -> 수량을 곱셈하여 연산을 수행해야 함 */

public class ProductVO {

	public String strPCode; // 상품코드
	public String strPName; // 상품명
	public String strItem;  // 품목명
	public String strDName; // 거래처명
	public int iPrice; 		// 매입단가
	public int oPrice; 		// 매출단가
	
	/* Java에서는 클래스를 선언하면 public String toString() method가
	 * 자동으로 생성된다 하지만 기본적으로 코드는 보이지 않는다.

	 * toString() method는 객체를 생성했을때 어떤 클래스를 사용했는지
	 * 생성된 객체가 컴퓨터 기억장치에 저장되어있는 주소를 알려주는
	 * 코드가 담겨있다

	 * Java 코딩에서 toString() method의 기본 역할은 크게 필요하지 않다
	 * 그래서 일반적으로 VO 클래스를 만들때는 임의로 toString method를
	 * 다시 만들어준다 그리고 인스턴스 변수에 입력된 값을 알려주는 
	 * 디버깅 코드를 생성한다
	 * ==> 자동으로 만들어져 있는 toString() method를 개발자가 임의로
	 * 	   다시 만들었다 : 메서드의 재정의 (method Override)
	 * 	   기존 Java가 만든 자동으로 생성된 코드는 감춰지게 된다 */
	
	public String toString() {
		System.out.println("┌────────────────────────────────┐");
		System.out.println("|       입력된 데이터 확인       |");
		System.out.println("└────────────────────────────────┘");
		System.out.printf("상품코드 : %s" + "\n",this.strPCode);
		System.out.printf("상품명 : %s" + "\n",this.strPName);
		System.out.printf("거래처 : %s" + "\n",this.strDName);
		System.out.printf("품목명 : %s" + "\n",this.strItem);
		System.out.printf("매입단가 : %s" + "\n",this.iPrice);
		System.out.printf("매출단가 : %s" + "\n",this.oPrice);
		return null;
	}
}