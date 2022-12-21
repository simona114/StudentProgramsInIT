package com.example.students.student;

public class StudentModel {
    private String mStudentName;
    private String mStudentNumber;

    public StudentModel(String studentName, String studentNumber){
        mStudentName = studentName;
        mStudentNumber = studentNumber;
    }

    public String getStudentName() {
        return mStudentName;
    }

    public String getStudentNumber() {
        return mStudentNumber;
    }
}
