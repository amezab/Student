package org.example;

public class Son extends Parent{
    public Son(String name, int age, String address, String phoneNumber) {
        super(name, age, address, phoneNumber);
    }

    String schoolName;
    String grade;

    public String getSchoolName() {
        return schoolName;
    }
}
