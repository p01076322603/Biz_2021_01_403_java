package com.callor.student;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;

public class StudentEx_01 {

    public static void main(String[] args) {

	StudentService sService = new StudentServiceImplV1();

	boolean listStatus = sService.makeStudentList();
	
	while (listStatus == true) {
	   if (sService.findStudent() == false)
	       break;
	    sService.printStudentInfo();
	}
    }
}
