package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.model.values.Values;
import com.callor.student.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

    private List<StudentVO> studentList;
    private StudentVO studentInfo = null;

    public StudentServiceImplV1() {
	studentList = new ArrayList<StudentVO>();
    }

    public boolean makeStudentList() {

	String fileName = "src/com/callor/student/학생정보리스트.txt";

	FileReader fileReader = null;
	BufferedReader buffer = null;

	
	int studentCount = 0;
	int exceptionCount = 0;
	try {
	    fileReader = new FileReader(fileName);
	    buffer = new BufferedReader(fileReader);

	    while (true) {
		String fileLine = buffer.readLine();

		if (fileLine == null) {
		    break;
		}
		studentCount++;
		String[] studentInfo = fileLine.split(":");

		try {
		    StudentVO studentVO = new StudentVO(
			    studentInfo[Values.STUDENT_ID],
			    studentInfo[Values.STUDENT_NAME], 
			    studentInfo[Values.STUDENT_MAJOR],
			    studentInfo[Values.STUDENT_GRADE], 
			    studentInfo[Values.STUDENT_CLASS],
			    studentInfo[Values.STUDENT_ADDRESS], 
			    studentInfo[Values.STUDENT_PNUMBER]);

		    studentList.add(studentVO);

		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("\n데이터 파일 " + studentCount + "번 줄의 형식에 문제가 있습니다");
		    System.out.printf(studentCount + "번 줄의 내용 : " + "%s", fileLine + "\n");
		    exceptionCount++;
		}
	    }
		buffer.close();
		fileReader.close();
		
	} catch (FileNotFoundException e) {
	    System.out.println("파일을 찾지 못했습니다");
	    return false;
	} catch (IOException e) {
	    System.out.println("파일을 읽는 중 문제가 발생하였습니다");
	    return false;
	}
	System.out.println("\n" + (studentCount - exceptionCount) + "명의 학생정보가 등록되었습니다");
	
	return true;
    }

    public boolean findStudent() {

	Scanner scan = new Scanner(System.in);

	while (true) {

	    System.out.println(Values.dLine(50));
	    System.out.println("찾는 학생이름을 입력하세요(종료하려면 Quit을 입력)");
	    System.out.println(Values.sLine(50));
	    System.out.print("이름 >> ");

	    String studentName = scan.nextLine();

	    if (studentName.equalsIgnoreCase("Quit"))
		return false;

	    int listSize = studentList.size();
	    for (int i = 0; i < listSize; i++) {

		StudentVO student = studentList.get(i);

		if (studentName.equals(student.getStudentName())) {
		    this.studentInfo = student;
		    return true;
		}
	    }

	    System.out.println("\n" + Values.dLine(50));
	    System.out.println(studentName + " 자료는 없습니다");
	    System.out.println(Values.dLine(50) + "\n");
	}
    }

    public void printStudentInfo() {

	if (studentInfo == null)
	    return;

	System.out.println(Values.dLine(50));
	System.out.printf("학번 : %s\n", studentInfo.getStudentID());
	System.out.printf("이름 : %s\n", studentInfo.getStudentName());
	System.out.printf("학과 : %s\n", studentInfo.getStudentMajor());
	System.out.printf("학년 : %s학년\n", studentInfo.getStudentGrade());
	System.out.printf("반 : %s반\n", studentInfo.getStudentClass());
	System.out.printf("주소 : %s\n", studentInfo.getStudentAddress());
	System.out.printf("전화번호 : %s\n", studentInfo.getStudentPNumber());
	System.out.println(Values.dLine(50) + "\n");
    }
}