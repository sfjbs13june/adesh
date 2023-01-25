package com.adesh.app.model;

public class Student {
    String Rollno;
    String Name;
    String Std;
    String SchoolName;

    public Student(String rollno, String name, String std, String schoolName) {
        Rollno = rollno;
        Name = name;
        Std = std;
        SchoolName = schoolName;
    }

    public String getRollno() {
        return Rollno;
    }

    public void setRollno(String rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStd() {
        return Std;
    }

    public void setStd(String std) {
        Std = std;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }
}