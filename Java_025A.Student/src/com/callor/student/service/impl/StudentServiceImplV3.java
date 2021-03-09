package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.values.Values;

public class StudentServiceImplV3 extends StudentServiceImplV1 {

    @Override
    public void searchStudent() {

	Scanner scan = new Scanner(System.in);
	
	while (true) {

	    System.out.println(Values.dLine(50));
	    System.out.println("이름을 입력 !!!");
	    System.out.println(Values.dLine(50));
	    System.out.print("이름 >> ");
	    
	    String strName = scan.nextLine();
	    
	    // sVO를 선언하고 null로 clear
	    StudentVO sVO = null;
	    for(StudentVO vo : stdList) {
		if (strName.equals(vo.getStName())) {
		    sVO = vo;
		}
	    }

	    if (sVO == null) {
		System.out.println("못찾겠다 꽤꼬리");
	    } else {
		this.printStVO(sVO);
	    }
	}
    }
}