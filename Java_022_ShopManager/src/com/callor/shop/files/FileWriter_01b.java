package com.callor.shop.files;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01b {

	/* main() method : Java의 진입점 method
	 * 프로젝터를 가상머신에 의해 최초로 실행할 때 가상머신이
	 * 자동으로 호출되도록 만드는 method
	 * FIleWriter_01.main("...") 형식으로 호출이 된다. */
	public static void main(String[] args) {

		String numsFile = "src/com/callor/shop/nums.txt";
		Random rnd = new Random();

		/* 파일에 데이터를 저장하기 위해 2개의 클래스를 객체로 선언
		 * 변수를 지금 바로 생성 하지 않을 경우 clear를 해준다
		 * 숫자형일 경우는 0으로 초기화, 클래스일경우 null 값으로 초기화
		 * String str = ""; String str = null; */

		/* Text 파일을 생성, 저장 하기 위해 FileWriter 클래스와 PrintWriter 클래스를 사용한다
		 * 클래스를 사용한 객체 선언과 객체 생성 부분을 분리해서 작성해야 한다.
		 * 객체를 생성, 사용시 try - catch가 의무 적용되어야 하기 때문에 코드 작성상 분리해서
		 * 작성해주는것이 좋다. */
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			// FileWriter, PrintWriter 클래스의 객체 인스턴스화
			/* 이 과정에서 아무리 코드를 잘 작성해놓아도 IOException이 발생하는 경우가 많다
			 * Java 코딩에서는 이러한 경우 강제 의무적으로 예외처리를 위해 try - catch를 
			 * 사용한다. */
			fileWriter = new FileWriter(numsFile);

			// fileWriter를 PrintWriter와 연결
			/* fileWriter 만으로 파일 저장을 할 수 있지만 좀 더 복잡한 과정을 실행해야 한다
			 * fileWriter를 직접 사용하여 파일 저장을 하는 방식으로 저수준(low level) 방식
			 * 이라고 한다. 하지만 저수준 방식은 새로운 사용방법을 써야하기에 부담스럽다 
			 * fileWriter와 PrintWriter를 연결하면 평소에 사용하던 System.out.print*() method
			 * 와 비슷한 방식으로 코드를 작성할 수 있다. 이러한 방식을 고수준(high level)
			 * 방식이라고 한다. 저수준보다 다소 느리게 작동될 수 있지만, 코드 작성의 부담이
			 * 훨씬 줄어든다. 또한, 최근의 컴퓨터는 성능의 향상으로 큰 차이가 나지 않는다. */
			printer = new PrintWriter(fileWriter);

			for (int i = 0; i < 1000; i++) {
				int num = rnd.nextInt(1000) + 1;
				printer.println(num);
			}

			/* FileWriter와 PrintWriter 등을 사용하여 파일에 내용을 기록한 후에는 반드시 객체
			 * 들을 close() 해주어야 한다. close()를 수행하기 전에는 기록된 데이터들을 운영체
			 * 제가 임시 보관하고 있다. 운영체제는 close() 명령이 수행되어야 데이터를 파일에
			 * 기록한다. */
			printer.close();
			fileWriter.close();
			
			System.out.println("출력되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}