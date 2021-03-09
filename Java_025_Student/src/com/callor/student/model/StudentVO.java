package com.callor.student.model;

public class StudentVO {

    private String StudentID;
    private String StudentName;
    private String StudentMajor;
    private String StudentGrade;
    private String StudentClass;
    private String StudentAddress;
    private String StudentPNumber;

    
    public StudentVO() {
    }

    public StudentVO(String studentID, String studentName, String studentMajor, String studentGrade,
	    String studentClass, String studentAddress, String studentPNumber) {
	StudentID = studentID;
	StudentName = studentName;
	StudentMajor = studentMajor;
	StudentGrade = studentGrade;
	StudentClass = studentClass;
	StudentAddress = studentAddress;
	StudentPNumber = studentPNumber;
    }
    
    
    public String getStudentID() {
        return StudentID;
    }
    public void setStudentID(String studentID) {
        StudentID = studentID;
    }
    public String getStudentName() {
        return StudentName;
    }
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
    public String getStudentMajor() {
        return StudentMajor;
    }
    public void setStudentMajor(String studentMajor) {
        StudentMajor = studentMajor;
    }
    public String getStudentGrade() {
        return StudentGrade;
    }
    public void setStudentGrade(String studentGrade) {
        StudentGrade = studentGrade;
    }
    public String getStudentClass() {
        return StudentClass;
    }
    public void setStudentClass(String studentClass) {
        StudentClass = studentClass;
    }
    public String getStudentAddress() {
        return StudentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }
    public String getStudentPNumber() {
        return StudentPNumber;
    }
    public void setStudentPNumber(String studentPNumber) {
        StudentPNumber = studentPNumber;
    }
    
    @Override
    public String toString() {
	return "StudentVO [StudentID=" + StudentID + ", StudentName=" + StudentName + ", StudentMajor=" + StudentMajor
		+ ", StudentGrade=" + StudentGrade + ", StudentClass=" + StudentClass + ", StudentAddress="
		+ StudentAddress + ", StudentPNumber=" + StudentPNumber + "]";
    }
    
}
