package com.rightfind.studentTextFile;

public class Student {
    int rollNo;
    String name, address, phoneNumber;

    public Student(int rollNo, String name, String address, String phoneNumber) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public String toString() {
        return "Roll No: " + this.rollNo + ", Name: " + this.name + ", Address: " + this.address + ", Phone Number: " + this.phoneNumber;
    }
}