package com.callor.student;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV3;

public class StudentEx_01 {

    public static void main(String[] args) {

	StudentService stService = new StudentServiceImplV3();

	stService.loadStudentFromFile();
	stService.searchStudent();
    }
}
