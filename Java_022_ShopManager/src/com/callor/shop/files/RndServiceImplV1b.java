package com.callor.shop.files;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV1b {

	/* makeRnd()와 saveFileRnd() method가 공용으로 사용할 객체이므로
	 * 인스턴스 객체 변수로 선언한다 */
	private List<Integer> intList;
	
	public RndServiceImplV1b() {
		intList = new ArrayList<Integer>();
	}
	
	// Random 수를 생성하여 List에 담을 method
	public void makeRnd() {
		
		Random rnd = new Random();
		
		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(100) + 1;
			intList.add(num);
		}
	}
	
	/* 객체지향의 다형성 (Polymorphism)
	 * 원칙은 한 클래스 파일 내에서는 같은 이름의 method를 두번 이상
	 * 정의할 수 없다. 하지만 객체지향 언어에서는 method의 매개변수의
	 * 유무, 종류, 자료형이 다르면 같은 이름의 method를 중복하여 정의
	 * 할 수 있다. 
	 * 상위 클래스의 method 재정의 : Overriding
	 * 클래스 내부 method를 여러개 만들어 사용 : Overloading */
	public void saveFileRnd() {

		String fileName = "src/com/callor/shop/files/nums_rnd.txt";
		this.saveFileRnd(fileName);
	}
	
	/* RndServiceImplV1 클래스를 처음 디자인 할때는 파일 이름을 코드에
	 * 직접 작성하였다. 이후 필요에 의해 파일의 이름을 method의 매개변
	 * 수로 받아 사용할 수 있도록 변경하여 V2를 만들었다. 그러자 처음
	 * V1 클래스를 호출하여 만들었던 코드들에서 오류가 발생했다.
	 * 이 오류를 객체지향의 다형성 원리를 이용하여 해결하였다. 만약
	 * saveFileRnd() 라고 method를 호출하면 코드에 포함된 파일이름을
	 * 적용하여 saveFileRnd(파일이름)을 method를 호출하도록 만들었다.
	 * 이제는 saveFileRnd(), saveFileRnd(파일 이름) 두가지 중 어떤것이
	 * 든 호출하여 사용해도 문제가 발생하지 않는다. */
	
	// List에 담긴 숫자들을 파일에 저장하는 method
	public void saveFileRnd(String fileName) {
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			
			int nCount = 0;
			for (int n : intList) {
				
				printer.print(n + ":");
				if (++nCount % 5 == 0) {
					printer.println();
				}
			}
			
			printer.close();
			fileWriter.close();
			
			System.out.println("파일 저장 완료");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/* saveFileRnd() method의 코드를 실행하여 난수가 저장되어 있는
	 * 파일에서 난수를 다시 읽어와 연산을 수행하는 method
	 * 저장할 때 사용한 파일이름 == 읽을 때 사용할 파일이름 ──>
	 * 두개의 method가 한개의 공통된 파일 이름을 사용하게 된다
	 * 결국 saveFileRnd() method만 사용하기 위해서 선언된 fileName
	 * 변수는 인스턴스 영역에 선언되어야 한다 */
	public void loadFileRnd() {
		
	}
} // end class